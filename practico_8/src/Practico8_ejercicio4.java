/*Hacer un programa que dado una matriz de enteros de tama�o 5*10 que se encuentra
precargada, solicite al usuario un numero entero y una posici�n fila, columna. Con estos
datos tendr� que realizar un corrimiento a derecha (se pierde el �ltimo valor en dicha fila)
y colocar el numero en la matriz en la posici�n fila, columna indicada.*/

//importar librer�as Random, BufferedReader e InputStreamReader
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practico8_ejercicio4{
	//declarar constantes
	public static final int MAXFILA = 5;
	public static final int MAXCOLUMNA = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		//declaro variables de entrada
		int numeroIngresado;
		int filaIngresada;
		int columnaIngresada;
		//declaro la matriz de enteros y le asigno tama�o 5*10
		int [][] matriz = new int [MAXFILA][MAXCOLUMNA];
		//declaro el buffered
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//cargar con enteros la matriz
		cargar_la_matriz(matriz);
		//imprimir la matriz
		imprimir_la_matriz(matriz);
		//try
		try{
			//pedir al usuario un numero
			System.out.println("Ingrese un n�mero para insertar en la matriz");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			//pedir al usuario una fila
			System.out.println("Ingrese la fila donde quiera insertar el n�mero");
			filaIngresada = Integer.valueOf(entrada.readLine());
			//pedir al usuario una columna
			System.out.println("Ingrese la columna donde quiera insertar el n�mero");
			columnaIngresada = Integer.valueOf(entrada.readLine());
			//chequeo que el valor de fila y columna est� dentro del rango:
			if ((filaIngresada>=0) && (filaIngresada<MAXFILA) && (columnaIngresada>=0) && (columnaIngresada<MAXCOLUMNA)){
				/*ac� puedo hacer una de dos cosas, puedo directamente hacer un m�todo insertar valor en la matriz (par�metros matriz, numero, fila, columna)
				que primero corra y despu�s inserte, o puedo hacer dos m�todos uno que primero corra y otro que despu�s inserte*/
				System.out.println("Hacemos el corrimiento a derecha");
				correr_a_derecha(matriz, filaIngresada, columnaIngresada);
				System.out.println("Insertamos el n�mero");
				insertar_numero_en_matriz(matriz, numeroIngresado, filaIngresada, columnaIngresada);
			}
		}
		//catch
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	//m�todo correr a derecha
	public static void correr_a_derecha(int [][] matriz, int filaIngresada, int columnaIngresada){
		//for columa MAX hasta columna ingresada, columna--
		for (int columna = MAXCOLUMNA-1; columna > columnaIngresada; columna--){
			//hago matriz en fila ingresada columna se vuelve columna-1
			matriz[filaIngresada][columna] = matriz[filaIngresada][columna-1];
		}
		imprimir_la_matriz(matriz);
	}
	 
	//metodo insertar
	public static void insertar_numero_en_matriz(int [][] matriz, int numeroIngresado, int filaIngresada, int columnaIngresada){
		//me paro en filaingresada columnaingresada se vuelve numeroingresado
		matriz [filaIngresada][columnaIngresada] = numeroIngresado;
		imprimir_la_matriz(matriz);
	}
	 
	//m�todo cargar
	public static void cargar_la_matriz(int [][] matriz){
		Random r = new Random();
		for (int fila = 0; fila<MAXFILA;fila++){
			for (int columna =0; columna<MAXCOLUMNA;columna++){
				matriz [fila][columna] = (r.nextInt(MAXVALOR+MINVALOR-1)+MINVALOR);
			}
		}
	}
	 
	//m�todo imprimir
	public static void imprimir_la_matriz(int [][] matriz){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(matriz[fila][columna] + "|");
			}
			System.out.println("");
		}
	}
}
