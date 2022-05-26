
/*Hacer un programa que dado un arreglo de enteros de tamano 10 que se encuentra
precargado, imprima por pantalla el promedio de la suma de sus valores.
*/

import java.util.Random;

public class Clase7_ejemplo3 {
	public static int MAX = 10;
	public static void main (String [] args) {
		int [] arrenteros = new int [MAX];
		int promedio;
		//	cargar el arreglo con alguno de los metodos propuestos
		cargar_arreglo_aleatorio_int(arrenteros);
		promedio = promedio_arreglo(arrenteros);
		System.out.println("El promedio del arreglo es: "+promedio);
	}
	public static int promedio_arreglo(int [] arr){
		int suma = 0;
		for (int pos = 0; pos < MAX; pos++){

			suma+=arr[pos];

		}
		return (suma/MAX);
	}
	
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAX-2+1) + 2);
		}
	}
}