/*Hacer un programa que dado una matriz de enteros de tamaño 4*5 que
se encuentra precargada, solicite al usuario el ingreso de una fila y dos
números enteros (columnas de la matriz), y ordene de forma creciente la
matriz en la fila indicada entre las dos posiciones columnas ingresadas.*/

//librerias random buffer e input
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practico8_ejercicio9{
	//constantes de tamaño de matriz y de carga de matriz
	public static void main (String[]args){
		//variables que ingresa el usuario
		//matriz 4*5 de enteros
		//buffer
		//cargar la matriz con enteros
		//imprimir la matrz
		//try
			//pedir una fila
			//levantar el input
			//pedir un primer número de columna
			//levantar el input
			//pedir un segundo número de columna
			//levantar el input
			//si fila está dentro del rango
				//si numero uno es menor a numero dos && esta dentro del rango
					//ordenar la matriz en esa fila entre esas columna (uno, dos)
				//si numero dos es menor a numero uno && esta dentro del rango
					//ordenar la matriz en esa fila entre esas columna (dos, uno)
		//catch
	}
	
	//método ordenar la matriz (numero1,numero2)
		//for columnaIndice = numero1; columaIndice<numero2; columnaIndice++
			//elmenor=indice
			//for columnaActual = columnaIndice+1; columnaActual<numero2;columnaActual++
				//si actual<el menor
					//elmenor = actual
			//si elmenor!= indice
				//aux=indice
				//indice=elmenor
				//elmenor==aux
	
	//método de carga de la matriz
	
	//método de impresión de la matriz
}
