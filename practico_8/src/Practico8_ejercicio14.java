/*Se tiene una matriz de caracteres de tamaño 4*20 de secuencias de
caracteres letras minúsculas entre ‘a’ y ‘z’ (por cada fila), separadas por ‘ ’
(espacios). La matriz esta precargada, y además cada fila empieza y termina
con uno o más separadores ‘ ’.

14. Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada, elimine de cada fila todas las ocurrencias de una secuencia
patrón dada por un arreglo de caracteres de tamaño igual al tamaño de
columnas de la matriz (solo tiene esa secuencia con separadores al inicio y al
final). Al eliminar en cada fila se pierden los valores haciendo los corrimientos.*/

/*No entiendo bien la consigna*/

import java.util.Random;
public class Practico8_ejercicio14{
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static final double PROBABILIDAD_LETRA = 0.4;
	public static void main (String []args){
		char [] arreglo = new char [MAXCOLUMNA];
		char [][]matriz = new char [MAXFILA][MAXCOLUMNA];
		cargar_matriz_secuencias_char(matriz);
		System.out.println("La matriz: ");
		imprimir_la_matriz(matriz);
		cargar_arreglo_aleatorio_secuencias_char(arreglo);
		System.out.println("El arreglo: ");
		imprimir_el_arreglo(arreglo);
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
	
	public static void imprimir_el_arreglo(char[]arreglo){
		for(int columna = 0; columna<MAXCOLUMNA; columna++){
			System.out.print("[" + arreglo[columna] + "]");
		}
	}
}
