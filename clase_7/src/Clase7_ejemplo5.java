/*Hacer un programa que dado un arreglo de enteros de tamano 8 que se encuentra precargado, solicite al usuario una posicion y
realice un corrimiento a derecha o hacia la mayor posicion del arreglo. Ademas imprima el arreglo antes y despues del
corrimiento
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Clase7_ejemplo5 {
	public static final int MAX = 8;
	public static void main (String[] args) {
		int laPosicionIngresada;
		int [] arr = new int [MAX];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		cargar_arreglo(arr);
		mostrar_el_arreglo(arr);
		
		//pedir posicion
		try{
			System.out.println("Ingrese una posición (entero): ");
			laPosicionIngresada = Integer.valueOf(entrada.readLine());
			corrimiento_derecha(arr, laPosicionIngresada);
		}
		catch (Exception exc){
			System.out.println(exc);
		}
		
		mostrar_el_arreglo(arr);
		
	}
	public static void corrimiento_derecha(int [] arr, int laPosicionIngresada){
		int indice = MAX-1; //partimos del final del arreglo
		while(indice>laPosicionIngresada){ //esto va a correr mientras el numero en el que me pare sea MAYOR al numero que quiero patear a la derecha
			arr[indice] = arr[indice-1]; //me paaro en el último valor del arreglo y le asigno el valor de la posicion anterior 
			indice--; //nos movemos una posicion a la izquierda
		}
	}
	
	//metodo cargar arreglo
	public static void cargar_arreglo(int [] arrenteros){
		Random r = new Random();
		for (int posicion = 0; posicion < MAX; posicion++){
			arrenteros[posicion]=(r.nextInt(MAX-0+1) + 0);
		}
	}
	
	//metodo imprimir arreglo
	public static void mostrar_el_arreglo(int [] arrenteros){
		for (int posicion = 0; posicion < MAX; posicion++){
				System.out.println("nombre_arreglo[" + posicion + "]=>: " + arrenteros[posicion]);
			}
	}
	
}
