/*Hacer un programa que dado una matriz de enteros de tamano 4*5 que se encuentra precargada, imprima por pantalla el
promedio de cada una de sus filas.
*/

public class Clase8_ejemplo2 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static void main (String[]args){
		int [][] matriz = {{1, 3, 5, 6, 15}, {1, 2, 3, 4, 5}, {1, 7, 3, 4, 5}, {1, 44, 3, 4, 5}}; //new int [MAXFILA][MAXCOLUMNA];
//		matriz = {{1, 3, 5, 6, 15}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		imprimir_promedio_filas(matriz);
	}
	public static void imprimir_promedio_filas(int[][] matriz){
		int promedio;
		for (int fila = 0; fila < MAXFILA; fila++){
			promedio = obtener_promedio_fila(matriz, fila);
			System.out.println("El promedio de la fila "+fila+" es de " + promedio);
		}
		//recorrer la matriz por cada fila, ir haciendo la suma de los valores
	}
	public static int obtener_promedio_fila(int [][] matriz, int fila){
		int sumaDeFila = 0;
		for(int columna = 0; columna < MAXCOLUMNA; columna++){
			sumaDeFila += matriz [fila][columna];
		}
		System.out.println("La suma de la fila número "+ fila +" es igual a " + sumaDeFila);
		int promedio = sumaDeFila/MAXCOLUMNA;
		return promedio;
	}
}


//dos formas
// una es hacer el  recorrido completo e ir acommulando una suma e imprimir

//segunda solucion es el metodo del promedio del arreglo