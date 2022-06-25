/*Hacer un programa que dado una matriz ordenada creciente por filas de
enteros de tamaño 4*5 que se encuentra precargada, solicite al usuario un
numero entero y una fila, y elimine la primer ocurrencia de numero en la
fila indicada (un número igual) si existe.*/

/*cómo hago para que me borre una ocurrencia que está en MAXCOLUMNA-1???*/

//librerías
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practico8_ejercicio8{
	//constantes
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		int numeroIngresado;
		int filaIngresada;
		//declaro la matrz de 4*5
		int [][] matriz = new int [MAXFILA][MAXCOLUMNA];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//la cargo con enters
		cargar_la_matriz(matriz);
		//la imprimo
		imprimir_la_matriz(matriz);
		//la ordeno creciente
		System.out.println("La ordenamos: ");
		ordenar_matriz_creciente(matriz);
		//la imprimo
		imprimir_la_matriz(matriz);
		//try
		try{
			//pedir numero
			System.out.println("Ingrese un número a eliminar");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			//pedir fila
			System.out.println("Ingrese la fila de la que lo quiere eliminar");
			filaIngresada = Integer.valueOf(entrada.readLine());
			//eliminar ocurrencia del numero en la fila si existe(fila)
			eliminar_ocurrencia(matriz, numeroIngresado, filaIngresada);
			//imprimir matriz
			imprimir_la_matriz(matriz);
		}
		//catch
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	//método eliminar ocurrencia(parametro fila)
	public static void eliminar_ocurrencia(int [][]matriz, int numeroIngresado, int filaIngresada){
		int columna = 0;
		//boolean encontré false
		boolean encontreUno = false;
		//iterar columans en esa fila mientras false
		while((columna<MAXCOLUMNA) && (encontreUno==false)){
			//si valor = numero
			if	(matriz[filaIngresada][columna] == numeroIngresado){
				//correr a izquierda
				correr_a_izquierda(matriz, filaIngresada, columna);
				//encontre = true
				encontreUno=true;
			}
			columna++;
		}
		//si boolean = false
		if(encontreUno==false){
			//imprimir no encontré
			System.out.println("No está el número" + numeroIngresado + "en la fila " + filaIngresada);
		}
	}
	
	//método correr a izquierda
	public static void correr_a_izquierda(int[][]matriz, int filaIngresada, int columnaParaBorrar){
		for (int columna =columnaParaBorrar; columna<MAXCOLUMNA-1; columna++){
			matriz[filaIngresada][columna] = matriz[filaIngresada][columna+1];
		}
	}
	
	public static void cargar_la_matriz(int [][]matriz){
		Random r = new Random();
		for (int fila =0; fila<MAXFILA; fila++){
			for(int columna = 0; columna<MAXCOLUMNA; columna++){
				matriz[fila][columna] = (r.nextInt(MAXVALOR+MINVALOR-1)+MINVALOR); 
			}
		}
	}
	public static void imprimir_la_matriz(int [][]matriz){
		for (int fila =0; fila<MAXFILA; fila++){
			System.out.print("|");
			for(int columna = 0; columna<MAXCOLUMNA; columna++){
				System.out.print(matriz[fila][columna] + "|"); 
			}
			System.out.println("");
		}
	}
	public static void ordenar_matriz_creciente(int [][]matriz){
		for (int fila = 0; fila<MAXFILA; fila++){
			ordenar_las_columnas(matriz, fila);
		}
	}
	public static void ordenar_las_columnas(int[][]matriz, int fila) {
		int elMenor;
		for(int columnaIndice = 0; columnaIndice<MAXCOLUMNA; columnaIndice++){
			elMenor = columnaIndice;
			for (int columnaActual = columnaIndice+1; columnaActual<MAXCOLUMNA; columnaActual++){
				if(matriz[fila][columnaActual]<matriz[fila][elMenor]){
					elMenor = columnaActual;
				}
			}
			if (elMenor != columnaIndice){
				int aux = matriz[fila][columnaIndice];
				matriz[fila][columnaIndice] = matriz[fila][elMenor];
				matriz [fila][elMenor] = aux;
			}
		}
	}
}
