
/*Hacer un programa que dado una matriz de enteros de tamano 4*5 que se
encuentra precargada, encuentre la posicion fila,columna de un
numero entero ingresado por el usuario. Si existe, muestre esa
posicion por pantalla, o indique que no existe.
*/
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase8_ejemplo5 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int [][] matriz = new int [MAXFILA][MAXCOLUMNA];
		int numeroIngresado;
		int filaDelNumero;
		int columnaDelNumero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		cargar_matriz_aleatorio_int(matriz);
		imprimir_matriz_int(matriz);
		//pedir numero al usuario
		try{
			System.out.println("Por favor ingrese un entero: ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			//buscarlo en la matriz
			//existe = buscar_si_existe(matriz);
			filaDelNumero = buscar_la_fila(matriz, numeroIngresado);
			columnaDelNumero = buscar_la_columna(matriz, numeroIngresado);
			//devolver la posicion si existe
			if ((filaDelNumero!=-1) && (columnaDelNumero!=-1)){
				System.out.println("El número ingresado: "+numeroIngresado+" está en la matriz. Se encuentra en la fila "+filaDelNumero+" y en la columna " + columnaDelNumero);
			}
			//si no existe indicarlo
			else{
				System.out.println("El número ingresado no está en la matriz");
			}

		}
		catch (Exception exc){
			System.out.println(exc);
		}
		
	}
	public static int buscar_la_fila(int [][] matriz, int numeroIngresado){
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				if (numeroIngresado == matriz[fila][columna]){
					return fila;
				}
			}
		}
		return -1;
	}
	public static int buscar_la_columna(int [][] matriz, int numeroIngresado){
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				if (numeroIngresado == matriz[fila][columna]){
					return columna;
				}
			}
		}
		return -1;
	}
	public static void cargar_matriz_aleatorio_int(int [][] matriz){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				matriz[fila][columna]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR);
			}
		}
	}
	public static void imprimir_matriz_int(int [][] matriz){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(matriz[fila][columna]+"|");
			}
			System.out.println("");
		}
	}
}
 