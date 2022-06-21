/*Hacer un programa que dado una matriz de enteros de tamano 4*5 que se encuentra precargada, imprima por pantalla el promedio
de cada una de sus columnas.
0 1 2
0 |1|3|5|
1 |2|4|4|
*/
import java.util.Random;
public class Clase8_ejemplo4 {
	public static final int MAXFILAS = 4;
	public static final int MAXCOLUMNAS = 5;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int [][] matriz = new int [MAXFILAS][MAXCOLUMNAS];
		cargar_matriz_aleatorio_int(matriz);
		imprimir_matriz_int(matriz);
		imprimir_promedio_columnas(matriz);
	}
	
	public static void imprimir_promedio_columnas(int [][] matriz){
		int promedio;
		for (int columna = 0; columna < MAXCOLUMNAS; columna++){
			promedio = obtener_promedio(matriz, columna);
			System.out.println("El promedio de la columna "+ columna +" es de "+ promedio);
		}
	}
	
	public static int obtener_promedio(int [][] matriz, int columna){
		int promedio, sumaDeColumnas = 0;
		for (int fila = 0; fila < MAXFILAS; fila++){
			sumaDeColumnas += matriz[fila][columna]; 
		}
		promedio = sumaDeColumnas/MAXFILAS;
		return promedio;
	}
	
	public static void cargar_matriz_aleatorio_int(int [][] matriz){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILAS; fila++){
			for (int columna = 0; columna < MAXCOLUMNAS; columna++){
				matriz[fila][columna]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR);
			}
		}
	}
	public static void imprimir_matriz_int(int [][] matriz){
		for (int fila = 0; fila < MAXFILAS; fila++){
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNAS; columna++){
				System.out.print(matriz[fila][columna]+"|");
			}
			System.out.println("");
		}
	}
}
