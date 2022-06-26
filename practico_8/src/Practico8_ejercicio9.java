/*Hacer un programa que dado una matriz de enteros de tamaño 4*5 que
se encuentra precargada, solicite al usuario el ingreso de una fila y dos
números enteros (columnas de la matriz), y ordene de forma creciente la
matriz en la fila indicada entre las dos posiciones columnas ingresadas.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practico8_ejercicio9{
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		int filaIngresada;
		int posicion1;
		int posicion2;
		int [][] matriz = new int [MAXFILA][MAXCOLUMNA];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		cargar_la_matriz(matriz);
		imprimir_la_matriz(matriz);
		try{
			System.out.println("Ingrese una fila: ");
			filaIngresada = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un número de posición en la fila: ");
			posicion1 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese otro número de posición en la fila: ");
			posicion2 = Integer.valueOf(entrada.readLine());
			if ((filaIngresada>=0) && (filaIngresada<MAXFILA)){
				if((posicion1>=0)&&(posicion1<MAXCOLUMNA)&&(posicion2>=0)&&(posicion2<MAXCOLUMNA)){
					if(posicion1<posicion2){
						odenar_la_matriz_entre_posiciones(matriz, filaIngresada, posicion1, posicion2);
					}
					if(posicion2<posicion1){
						odenar_la_matriz_entre_posiciones(matriz, filaIngresada, posicion2, posicion1);
					}
					imprimir_la_matriz(matriz);
				}
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	public static void odenar_la_matriz_entre_posiciones(int [][] matriz, int filaIngresada, int posicion1, int posicion2){
		for(int columnaIndice = posicion1; columnaIndice<posicion2; columnaIndice++){
			int elMenor = columnaIndice;
			for(int columnaActual = columnaIndice+1; columnaActual<=posicion2; columnaActual++){
				if(matriz[filaIngresada][columnaActual]<matriz[filaIngresada][elMenor]){
					elMenor = columnaActual;
				}
			}
			if(elMenor != columnaIndice){
				int aux = matriz[filaIngresada][columnaIndice];
				matriz[filaIngresada][columnaIndice] = matriz[filaIngresada][elMenor];
				matriz[filaIngresada][elMenor] = aux;
			}
		}
	}
	
	public static void cargar_la_matriz(int[][]matriz){
		Random r = new Random();
		for (int fila = 0; fila<MAXFILA; fila++){
			for(int columna=0;columna<MAXCOLUMNA; columna++){
				matriz[fila][columna]= (r.nextInt(MAXVALOR+MINVALOR-1)+MINVALOR);
			}
		}
	}

	public static void imprimir_la_matriz(int [][]matriz){
		for (int fila = 0; fila<MAXFILA; fila++){
			for(int columna=0;columna<MAXCOLUMNA; columna++){
				System.out.print("[" + matriz[fila][columna] + "]");
			}
			System.out.println("");
		}
	}
}
