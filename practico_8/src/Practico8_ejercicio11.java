/*Se tiene una matriz de enteros de tamaño 4*20 de secuencias de números
entre 1 y 9 (por cada fila), separadas por 0. La matriz esta precargada, y
además cada fila empieza y termina con uno o más separadores 0.

11. Hacer un programa que dada la matriz de secuencias de enteros definida y
precargada permita encontrar por cada fila la posición de inicio y fin de la
secuencia cuya suma de valores sea mayor.*/

import java.util.Random;

public class Practico8_ejercicio11{
	
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double PROBABILIDAD_NUMERO = 0.4;
	
	public static void main (String[]args){
		int inicioSecuencia;
		int finSecuencia;
		int [][] matriz = new int [MAXFILA][MAXCOLUMNA];
		cargar_la_matriz_secuencias_enteros(matriz);
		imprimir_la_matriz(matriz);
		for(int fila = 0;fila<MAXFILA; fila++){
			inicioSecuencia = obtener_inicio_secuencia_mayor_suma(matriz, fila);
			finSecuencia = obtener_fin_secuencia(matriz, fila, inicioSecuencia);
			if ((inicioSecuencia!=MAXCOLUMNA) && (finSecuencia!=MAXCOLUMNA)){
				System.out.println("En la fila " + fila + " la secuencia cuya suma de valores es mayor empieza en la posición " +inicioSecuencia+ " y termina en la posición "+finSecuencia);
			}
		}
	}
	
	public static int obtener_inicio_secuencia_mayor_suma(int [][] matriz, int fila){
		int posicion = MAXCOLUMNA;
		int posiblePosicion = 0;
		int suma =0;
		int mayorSuma = 0;
		int columna = 0;
		while (columna<MAXCOLUMNA){
			if(matriz[fila][columna] != 0){
				suma += matriz[fila][columna];
				if (matriz[fila][columna-1] == 0){
					posiblePosicion = columna;
				}
				if(matriz[fila][columna+1] == 0){
					if (suma>mayorSuma){
						mayorSuma = suma;
						posicion = posiblePosicion;
					}
					suma = 0;
					posiblePosicion =0;
				}
			}
			columna++;
		}
		return posicion;
	}
	
	public static int obtener_fin_secuencia(int[][]matriz, int fila, int inicioSecuencia){
		int posicion = MAXCOLUMNA;
		boolean corte = false;
		while(inicioSecuencia<MAXCOLUMNA){
			if ((matriz[fila][inicioSecuencia] != 0) && (matriz[fila][inicioSecuencia+1] == 0) && (corte==false)){
				posicion = inicioSecuencia;
				corte = true;
			}
			inicioSecuencia++;
		}
		return posicion;
	}
	
	public static void cargar_la_matriz_secuencias_enteros(int[][]matriz){
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
