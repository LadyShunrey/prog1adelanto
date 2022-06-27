/*Se tiene una matriz de enteros de tamaño 4*20 de secuencias de números
entre 1 y 9 (por cada fila), separadas por 0. La matriz esta precargada, y
además cada fila empieza y termina con uno o más separadores 0.

13. Hacer un programa que dada la matriz de secuencias de enteros definida y
precargada, y un número entero ingresado por el usuario, elimine de cada fila
las secuencias de tamaño igual al número ingresado.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practico8_ejercicio13{
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double PROBABILIDAD_NUMERO = 0.4;
	public static void main (String[]args){
		int numeroIngresado;
		int [][]matriz = new int [MAXFILA][MAXCOLUMNA];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		cargar_la_matriz_secuencias_int(matriz);
		imprimir_la_matriz(matriz);
		try{
			System.out.println("Ingrese un número para borrar todas las secuencias de ese tamaño: ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			eliminar_secuencias_igual_tamaño(matriz, numeroIngresado);
			imprimir_la_matriz(matriz);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	public static void eliminar_secuencias_igual_tamaño(int[][]matriz, int numeroIngresado){
		System.out.println("Buscamos las secuencias que tengan el mismo tamaño que el número ingresado:");
		int fila = 0;
		int columna = 0;
		int sumaSize = 0;
		int inicioSecuencia = 0;
		while(fila<MAXFILA){
			while(columna<MAXCOLUMNA){
				if(matriz[fila][columna]!=0){
					sumaSize+=1;
					if (matriz[fila][columna-1]==0){
						inicioSecuencia = columna;
					}
				}
				if ((matriz[fila][columna]==0)&& (columna!=0)){
					if (matriz[fila][columna-1]!=0){
						if(sumaSize==numeroIngresado){
							int finSecuencia = columna-1;
							System.out.println("Hay una secuencia de tamaño "+numeroIngresado+" en la fila "+fila+" entre la posición " +inicioSecuencia+" y la posición "+ finSecuencia);
							System.out.println("La mandamos a borrar");
							borrar_secuencia(matriz, fila, inicioSecuencia, finSecuencia, numeroIngresado);
//							imprimir_la_matriz(matriz);
						}
						sumaSize = 0;
						inicioSecuencia = 0;
					}
				}
				columna++;
			}
			fila++;
			columna = 0;
		}
	}
	
	public static void borrar_secuencia(int[][]matriz, int fila, int inicioSecuencia, int finSecuencia, int numeroIngresado){
		int cantidadDeCorridas = 0;
		while(cantidadDeCorridas<numeroIngresado){
			for(int columna = inicioSecuencia; columna<=finSecuencia;columna++){
				matriz[fila][columna] = matriz[fila][columna+1];
			}
			cantidadDeCorridas++;
		}
	}
	
	public static void cargar_la_matriz_secuencias_int(int [][]matriz){
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
	
	public static void imprimir_la_matriz(int[][]matriz){
		for (int fila =0; fila<MAXFILA; fila++){
			for(int columna = 0; columna<MAXCOLUMNA; columna++){
				System.out.print("[" + matriz[fila][columna] + "]");
			}
			System.out.println("");
		}
	}
}
