/*Se tiene una matriz de enteros de tamaño 4*20 de secuencias de números
entre 1 y 9 (por cada fila), separadas por 0. La matriz esta precargada, y
además cada fila empieza y termina con uno o más separadores 0.

10. Hacer un programa que dada la matriz de secuencias de enteros definida
y precargada, permita obtener a través de métodos la posición de inicio y
la posición de fin de la secuencia ubicada a partir de una posición entera
y una fila, ambas ingresadas por el usuario. Finalmente, si existen imprima
por pantalla ambas posiciones obtenidas.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practico8_ejercicio10{
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double PROBABILIDAD_NUMERO = 0.4;
	public static void main (String[]args){
		int filaIngresada;
		int columnaIngresada;
		int inicioSecuencia;
		int finSecuencia;
		int [][]matriz = new int [MAXFILA][MAXCOLUMNA];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		cargar_la_matriz_secuencias(matriz);
		imprimir_la_matriz_secuencias(matriz);
		try{
			System.out.println("Ingrese un número de fila: ");
			filaIngresada = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese una posición en la fila: ");
			columnaIngresada = Integer.valueOf(entrada.readLine());
			inicioSecuencia = obtener_inicio_secuencia(matriz, filaIngresada, columnaIngresada);
			System.out.println(inicioSecuencia);
			//int posicion final = obtener fin secuencia();
			//si posicion final e inicial != de MAX
				//entonces imprimir
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	public static int obtener_inicio_secuencia(int [][] matriz, int filaIngresada, int columnaIngresada){
		int posicion = MAXCOLUMNA;
		boolean corte = false;
		//si caigo en un cero
		if (matriz[filaIngresada][columnaIngresada] == 0){
			//iterar hacia adelante hasta el primer número mientras bool=false
			while (corte==false && columnaIngresada<MAXCOLUMNA){
				//cuando encuentro un número
				if(matriz[filaIngresada][columnaIngresada] != 0){
					//variable posicion se vuelve columna
					posicion = columnaIngresada;
					//bool se vuelve true
					corte = true;
				}
				columnaIngresada++;
			}
		}
		//si caigo en un numero
			//iterar hacia atrás hasta un cero mientras que bool=false
				//variable posicion se vuelve el valor de la columna anterior (+1)
				//bool se vuelve true
		return posicion;
	}
	
	public static void cargar_la_matriz_secuencias(int[][]matriz){
		for (int fila = 0; fila < MAXFILA; fila++){
			cargar_arreglo_aleatorio_secuencias_int(matriz[fila]);
		}
		System.out.println("");
	}
	
	public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAXCOLUMNA-1] = 0;
		for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
			if (r.nextDouble()>PROBABILIDAD_NUMERO){
				arr[pos]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR); 
			}
			else{
				arr[pos]=0;				
			}
		}
	}
	
	public static void imprimir_la_matriz_secuencias(int [][]matriz){
		for (int fila =0; fila<MAXFILA; fila++){
			for(int columna = 0; columna<MAXCOLUMNA; columna++){
				System.out.print("[" + matriz[fila][columna] + "]");
			}
			System.out.println("");
		}
	}
}