/*Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, invierta el orden del contenido por fila. Este intercambio no se debe realizar
de manera explícita, hay que hacer un método que incluya una iteración de intercambio.*/

//importar las librerías que hagan falta creo que solo la RANDOM
import java.util.Random;
public class Practico8_ejercicio1{
	//declarar las constantes
	public static final int MAXFILA = 5;
	public static final int MAXCOLUMNA = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		//QUE TENGO QUE HACER:
		//declarar la matriz
		int [][] matriz = new int [MAXFILA][MAXCOLUMNA];
		//la cargo
		cargar_la_matriz(matriz);
		//la imprimo
		imprimir_la_matriz(matriz);
		//llamo el método para invertirla
		System.out.println("Invertimos la matriz: ");
		invertir_la_matriz(matriz);
		//la imprimo
		imprimir_la_matriz(matriz);
	}
	
	//método que invierte la matriz
	public static void invertir_la_matriz(int [][] matriz){
		//iterar la matriz por cada fila
		for (int fila = 0; fila < MAXFILA; fila++){
			//iterar la matriz por columna
			for(int columna = 0; columna < MAXCOLUMNA/2; columna++){
				//guardar el valor actual en una variable auxiliar
				int aux = matriz [fila][columna];
				//valor actual se vuelve valor de max-1-columna
				matriz [fila][columna] = matriz [fila][MAXCOLUMNA-1-columna];
				//max-1-columna se vuelve aux
				matriz [fila][MAXCOLUMNA-1-columna] = aux;
			}
		}
	}
	
	//método para cargar
	public static void cargar_la_matriz(int [][] matriz){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				matriz[fila][columna]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR);
			}
		}
	}
	
	//método para imprimir
	public static void imprimir_la_matriz(int [][] matriz){
		for(int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(matriz [fila][columna] + "|");
			}
			System.out.println("");
		}
	}
}
