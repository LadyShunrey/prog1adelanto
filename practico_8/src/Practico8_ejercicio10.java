/*Se tiene una matriz de enteros de tama�o 4*20 de secuencias de n�meros
entre 1 y 9 (por cada fila), separadas por 0. La matriz esta precargada, y
adem�s cada fila empieza y termina con uno o m�s separadores 0.

10. Hacer un programa que dada la matriz de secuencias de enteros definida
y precargada, permita obtener a trav�s de m�todos la posici�n de inicio y
la posici�n de fin de la secuencia ubicada a partir de una posici�n entera
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
			System.out.println("Ingrese un n�mero de fila: ");
			filaIngresada = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese una posici�n en la fila: ");
			columnaIngresada = Integer.valueOf(entrada.readLine());
			inicioSecuencia = obtener_inicio_secuencia(matriz, filaIngresada, columnaIngresada);
			finSecuencia = obtener_fin_secuencia(matriz, filaIngresada, inicioSecuencia);
			if ((inicioSecuencia!= MAXCOLUMNA) && (finSecuencia!=MAXCOLUMNA)){
				System.out.println("en la fila "+filaIngresada+ " el inicio de la secuencia est� en la posici�n " + inicioSecuencia + " y el final de la secuencia est� en " + finSecuencia);
			}
			else{
				System.out.println("No hay ninguna secuencia en esas posiciones");
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	public static int obtener_inicio_secuencia(int [][] matriz, int filaIngresada, int columnaIngresada){
		int posicion = MAXCOLUMNA;
		boolean corte = false;
		if (matriz[filaIngresada][columnaIngresada] == 0){
			while ((corte==false) && (columnaIngresada<MAXCOLUMNA)){
				if(matriz[filaIngresada][columnaIngresada] != 0){
					posicion = columnaIngresada;
					corte = true;
				}
				columnaIngresada++;
			}
		}
		if(matriz[filaIngresada][columnaIngresada] != 0){
			while ((corte==false) &&(columnaIngresada>-1)){
				if (matriz[filaIngresada][columnaIngresada-1] == 0){
					posicion = columnaIngresada;
					corte = true;
				}
				columnaIngresada--;
			}
		}
		return posicion;
	}
	
	public static int obtener_fin_secuencia(int [][]matriz, int filaIngresada, int inicioSecuencia){
		int posicion = MAXCOLUMNA;
		boolean corte = false;
		while ((corte==false) && (inicioSecuencia<MAXCOLUMNA)){
			if(matriz[filaIngresada][inicioSecuencia] != 0){
				if(matriz[filaIngresada][inicioSecuencia+1] == 0){
					posicion = inicioSecuencia;
					corte = true;
				}
			}
			inicioSecuencia++;
		}
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