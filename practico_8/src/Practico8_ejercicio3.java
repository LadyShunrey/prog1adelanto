/*Hacer un programa que dado una matriz de enteros de tama�o 5*10 que se encuentra
precargada, solicite al usuario una posici�n fila, columna y realice un corrimiento a
izquierda.*/

//importar librer�as
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practico8_ejercicio3{
	//constantes
	public static final int MAXFILA = 5;
	public static final int MAXCOLUMNA = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		//variables de entrada
		int filaIngresada;
		int columnaIngresada;
		//declarar matriz de enteros y asignar tama�o
		int [][] matriz = new int [MAXFILA][MAXCOLUMNA];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//cargar la matriz
		cargar_la_matriz(matriz);
		//imprimir la matriz
		imprimir_la_matriz(matriz);
		//try
		try{
			//pedir al usuario una fila
			System.out.println("Ingrese una fila: ");
			filaIngresada = Integer.valueOf(entrada.readLine());
			//pedir al usuario una columna
			System.out.println("Ingrese una columna: ");
			columnaIngresada = Integer.valueOf(entrada.readLine());
			//correr a izquierda hasta esa pos (parametros fila y columna)
			if ((filaIngresada>=0) && (filaIngresada<MAXFILA) && (columnaIngresada>=0) && (columnaIngresada<MAXCOLUMNA)){
				correr_a_izquierda(matriz, filaIngresada, columnaIngresada);
				imprimir_la_matriz(matriz);
			}
			else{
				System.out.println("El valor de fila o columna ingresado no es v�lido");
			}	
		}
		//catch
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	//m�todo que corre a izquierda (par�metros hasta fila y columna)
	public static void correr_a_izquierda(int [][] matriz, int filaIngresada, int columnaIngresada){
		for (int columna = 0; columna<columnaIngresada; columna++){
			matriz[filaIngresada][columna] = matriz[filaIngresada][columna+1]; 
		}
	}
	//m�todo cargar matriz
	public static void cargar_la_matriz(int [][]matriz){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				matriz[fila][columna] = (r.nextInt(MAXVALOR+MINVALOR-1)+MINVALOR);
			}
		}
	}
	//m�todo imprimir matriz
	public static void imprimir_la_matriz(int [][]matriz){
		for (int fila = 0; fila<MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna<MAXCOLUMNA; columna++){
				System.out.print(matriz[fila][columna] + "|");		
			}
			System.out.println("");
		}
	}
}