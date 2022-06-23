/*Hacer un programa que dado una matriz de enteros de tamano 4*5 que se encuentra 
precargada, solicite al usuario una posicion fila, columna, y realice un
corrimiento a derecha. Ademas imprima la matriz antes y despues del corrimiento
*/
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase8_ejemplo6 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int filaIngresada, columnaIngresada;
		//declarar matriz
		int [][] matriz = new int [MAXFILA][MAXCOLUMNA];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//cargar
		cargar_matriz_aleatorio_int(matriz);
		//imprimir
		imprimir_matriz_int(matriz);
		try{
			//pedir numero fila
			System.out.println("Ingrese una fila");
			filaIngresada = Integer.valueOf(entrada.readLine());
			//pedir numero columna
			System.out.println("Ingrese una columna");
			columnaIngresada = Integer.valueOf(entrada.readLine());
			//correr a derecha hasta esa posicion si existe
			if((filaIngresada>=0) && (filaIngresada<MAXFILA) && (columnaIngresada>=0) && (columnaIngresada<MAXCOLUMNA)){
				correr_a_derecha(matriz, filaIngresada, columnaIngresada);
			}
			else{
				System.out.println("El valor de fila o columna ingresado no es válido");
			}
			//imprimir matriz corrida			
			imprimir_matriz_int(matriz);
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}
	public static void correr_a_derecha(int[][]matriz, int filaIngresada, int columnaIngresada){
		int columna = MAXCOLUMNA-1;
		while(columna>columnaIngresada){
			matriz [filaIngresada][columna] = matriz [filaIngresada][columna-1];
			columna--;
		}
	}
	public static void cargar_matriz_aleatorio_int(int [][] matriz){
		Random r = new Random();
		for (int fila = 0; fila <MAXFILA; fila++){
			for(int columna = 0; columna<MAXCOLUMNA;columna++){
				matriz [fila][columna]= (r.nextInt(MAXVALOR+MINVALOR-1)+MINVALOR);
			}
		}
	}
	public static void imprimir_matriz_int(int [][] matriz){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print(" | ");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(matriz[fila][columna]+" | ");
			}
			System.out.println(" ");
		}
	}
}
