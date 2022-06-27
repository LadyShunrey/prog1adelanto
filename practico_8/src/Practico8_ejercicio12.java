/*Se tiene una matriz de caracteres de tamaño 4*20 de secuencias de
caracteres letras minúsculas entre ‘a’ y ‘z’ (por cada fila), separadas por ‘ ’
(espacios). La matriz esta precargada, y además cada fila empieza y termina
con uno o más separadores ‘ ’.

12. Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada, permita encontrar por cada fila la posición de inicio y fin de la
anteúltima secuencia (considerar comenzar a buscarla a partir de la ultima
posición de la fila).*/

import java.util.Random;
public class Practico8_ejercicio12 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static final double PROBABILIDAD_LETRA = 0.4;
	public static void main (String[]args){
		int inicioSecuencia;
		int finSecuencia;
		char [][]matriz = new char [MAXFILA][MAXCOLUMNA];
		cargar_matriz_secuencias_char(matriz);
		imprimir_la_matriz(matriz);
		for (int fila = 0; fila<MAXFILA; fila++){
			inicioSecuencia = obtener_inicio_anteultima_secuencia(matriz, fila);
			finSecuencia = obtener_fin_anteultima_secuencia(matriz, fila, inicioSecuencia);
			System.out.println("En la fila " +fila+" la anteúltima secuencia empieza en la posición "+inicioSecuencia+ " y el final está en la posición "+finSecuencia);
		}
	}
	
	public static int obtener_inicio_anteultima_secuencia(char[][]matriz, int fila){
		int posicion = MAXCOLUMNA;
		int columna = MAXCOLUMNA-1;
		int contador = 0;
		while((columna>=0) && (contador<=2)){
			if ((matriz[fila][columna] != ' ') && (matriz[fila][columna+1] == ' ')){
				contador++;
			}
			if((matriz[fila][columna] != ' ') && (matriz[fila][columna-1] == ' ')&& (contador<=2)){
				posicion = columna;
			}
			columna--;
		}
		return posicion;
	}
	
	public static int obtener_fin_anteultima_secuencia(char [][]matriz, int fila, int inicioSecuencia){
		int posicion = MAXCOLUMNA;
		int columna = inicioSecuencia;
		while ((columna<MAXCOLUMNA) && (posicion == MAXCOLUMNA)){
			if((matriz[fila][columna] != ' ') && (matriz[fila][columna+1]==' ')){
				posicion = columna;
			}
			columna++;
		}
		return posicion;
	}
	
	public static void cargar_matriz_secuencias_char(char[][]matriz){
		for (int fila = 0; fila < MAXFILA; fila++){
			cargar_arreglo_aleatorio_secuencias_char(matriz[fila]);
		}
		System.out.println("");
	}
	
	public static void cargar_arreglo_aleatorio_secuencias_char(char [] arr){
		Random r = new Random();
		arr[0] = ' ';
		arr[MAXCOLUMNA-1] = ' ';
		for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
			if (r.nextDouble()>PROBABILIDAD_LETRA){
				arr[pos]=(char)(r.nextInt(26) + 'a');
			}
			else{
				arr[pos]=' ';				
			}
		}
	}
	
	public static void imprimir_la_matriz(char[][]matriz){
		for (int fila =0; fila<MAXFILA; fila++){
			for(int columna = 0; columna<MAXCOLUMNA; columna++){
				System.out.print("[" + matriz[fila][columna] + "]");
			}
			System.out.println("");
		}
	}
}
