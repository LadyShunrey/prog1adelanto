/*Hacer un programa que cargue en un arreglo de enteros 5 valores desde teclado y lo imprima.
*/ 

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase7_ejemplo1bis {
	
	public static final int MAX = 5;
	
	public static void main(String[] args) {
		
		int [] arrenteros = new int [MAX];
		cargar_arreglo_int(arrenteros);
		imprimir_arreglo_int(arrenteros);
		
		
	}
	public static void cargar_arreglo_int(int [] arr){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			for (int position = 0; position<MAX; position++){
				System.out.println("Ingrese un entero: ");
				/*modifico arr[position] , entonces modifico arrenteros[position]*/
				arr[position] = Integer.valueOf(entrada.readLine());
			}
			
		}
		
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}
	
	public static void imprimir_arreglo_int(int[]arr){
		for(int position = 0; position<MAX; position++){
			//solo accedo a arr[pos] y no lo modifico, entonces no modifico arrenteros[pos]
			System.out.println("arrenteros[" + position + "] -> " + arr[position]);
		}

	}
}
