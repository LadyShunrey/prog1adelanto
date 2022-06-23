/*Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra
precargada, obtenga la cantidad de números pares que tiene y la imprima.*/

//importar libreria random
import java.util.Random;
public class Practico8_ejercicio2{
	//declarar e inicializar constantes
	public static final int MAXFILA = 5;
	public static final int MAXCOLUMNA = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		//declarar con su tamaño la matriz
		int [][] matriz = new int [MAXFILA][MAXCOLUMNA];
		//cargar la matriz
		cargar_la_matriz(matriz);
		//imprimir la matriz
		imprimir_la_matriz(matriz);
		//imprimir cantidad de pares
		imprimir_cantidad_de_pares(matriz);
	}
	
	//método que imprime la cantidad de pares
	public static void imprimir_cantidad_de_pares(int [][] matriz){
		//declarar variable contador de pares
		int contadorDePares = 0;
		//iterar la matriz por fila
		for (int fila = 0; fila < MAXFILA; fila++){
			//iterar la matriz por columna
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				//si numero módulo 2 == 0
				if ((matriz[fila][columna] % 2) == 0){
					//contador++
					contadorDePares++;
				}
			}
		}
		//imprimir contador
		System.out.println("La cantidad total de números pares que hay en la matriz es de: " + contadorDePares);
	}
	//método cargar la matriz
	public static void cargar_la_matriz(int [][] matriz){
		Random r = new Random();
		for(int fila = 0; fila < MAXFILA; fila++){
			for(int columna = 0; columna < MAXCOLUMNA; columna++){
				matriz[fila][columna]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR);
			}
		}
	}
	
	//método imprimir la matriz
	public static void imprimir_la_matriz(int [][] matriz){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for(int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(matriz[fila][columna] + "|");
			}
			System.out.println("");
		}
	}
}
