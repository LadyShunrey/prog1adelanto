/*Metodos de carga e impresión para reutilizar
 */
/*
	 0 1 2
0	|1|3|5|
1	|2|4|4|

	  0 1 2
fila |1|3|5|

*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase8_ejemplo1 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		char [][] matchar;
		int [][] matint;
		double [][] matdouble;
		matchar = new char[MAXFILA][MAXCOLUMNA];
		matint = new int[MAXFILA][MAXCOLUMNA];
		matdouble = new double[MAXFILA][MAXCOLUMNA];
		cargar_matriz_int(matint);
		imprimir_matriz_int(matint);
		cargar_matriz_aleatorio_char(matchar);
		cargar_matriz_aleatorio_int(matint);
		cargar_matriz_aleatorio_double(matdouble);
		imprimir_matriz_char(matchar);
		imprimir_matriz_int(matint);
		imprimir_matriz_double(matdouble);
	}
	public static void cargar_matriz_int(int [][] mat){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			for (int fila = 0; fila < MAXFILA; fila++){
				for (int columna = 0; columna < MAXCOLUMNA; columna++){
					System.out.println("Ingrese un entero para la posicion ["+fila+"]["+columna+"]");
					mat[fila][columna] = Integer.valueOf(entrada.readLine());
				}
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	public static void cargar_matriz_aleatorio_char(char [][] mat){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				mat[fila][columna]=(char)(r.nextInt(26) + 'a');
			}
		}
	}

	public static void cargar_matriz_aleatorio_int(int [][] mat){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				mat[fila][columna]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR);
			}
		}
	}

	public static void cargar_matriz_aleatorio_double(double [][] mat){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				mat[fila][columna]=((MAXVALOR-MINVALOR-1)*r.nextDouble() + MINVALOR*1.0);  
			}
		}
	}

	public static void imprimir_matriz_char(char [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(mat[fila][columna]+"|");
			}
			System.out.println("");
		}
	}

	public static void imprimir_matriz_int(int [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(mat[fila][columna]+"|");
			}
			System.out.println("");
		}
	}

	public static void imprimir_matriz_double(double [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(mat[fila][columna]+"|");
			}
			System.out.println("");
		}
	}
}