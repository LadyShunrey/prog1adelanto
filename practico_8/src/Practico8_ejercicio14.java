/*Se tiene una matriz de caracteres de tama�o 4*20 de secuencias de
caracteres letras min�sculas entre �a� y �z� (por cada fila), separadas por � �
(espacios). La matriz esta precargada, y adem�s cada fila empieza y termina
con uno o m�s separadores � �.

14. Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada, elimine de cada fila todas las ocurrencias de una secuencia
patr�n dada por un arreglo de caracteres de tama�o igual al tama�o de
columnas de la matriz (solo tiene esa secuencia con separadores al inicio y al
final). Al eliminar en cada fila se pierden los valores haciendo los corrimientos.*/

/*No entiendo bien la consigna*/

import java.util.Random;
public class Practico8_ejercicio14{
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	public static final double PROBABILIDAD_LETRA = 0.4;
	public static void main (String []args){
		char [] arreglo = new char [MAXCOLUMNA]; /*C�mo puede tener tama�o igual a las columnas de la matriz si s�lo tiene el patr�n?*/
		char [][]matriz = new char [MAXFILA][MAXCOLUMNA];
		cargar_matriz_secuencias_char(matriz);
		System.out.println("La matriz: ");
		imprimir_la_matriz(matriz);
		cargar_arreglo_aleatorio_secuencias_char(arreglo); /*�sto deber�a tener una "secuencia patr�n"*/
		System.out.println("El arreglo: ");
		imprimir_el_arreglo(arreglo);
		//eliminar ocurrencia de patr�n(matriz, arreglo)
	}
	
	//eliminar ocurrencia de patr�n(char[][]matriz, char[]arreglo)
		//int posicionInicialPatron
		//int posicionFinalPatron
		//int sizePatron=0
		//int posicionInicialMatriz
		//int posicionFinalMatriz
		//iterar el arreglo con while
			//si estoy en un n�mero
				//sizePatron+=1;
				//si antes tuve un cero
					//guardar posicion inicial
				//si despu�s tengo un cero
					//guardar posicion final
		//iterar la matriz con while
			//si estoy en un n�mero == valor de arreglo en pos inicial
				//posicionInicialMatriz = columna
				//while matriz[columna] == arreglo[posInicial]
					//si posInicial == posFinal
						//posicionFinalMatriz = columna
						//borrar_ocurrencia(matriz, fila, posicionInicialMatriz, posicionFinalMatriz, sizePatr�n);
					//columna++
					//posInicial++
			//columna++
	//}
			
	//public static void borrar_ocurrencia(char[][]matriz, int fila, int posicionInicialMatriz, int posicionFinalMatriz, int sizePatron){
		//int cantidadDeCorridas =0;
		//while (cantidadDeCorridas<sizePatron){
			//for (int columna = posicionInicialMatriz; columna<posicionFinalMatriz; columna++){
				//matriz[fila][columna]=matriz[fila][columna+1]
			//}
		//}
	//}
	
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
