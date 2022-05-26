/*Hacer un programa que cargue en un arreglo de enteros 5 valores desde teclado y lo imprima.
ESTE EJEMPLO ESTA HECHO SIN METODOS, SOLO PARA EXPLICAR COMO FUNCIONA (MAS ADELANTE SE HACE CON
METODOS)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase7_ejemplo1 {
	
	public static final int MAX = 5;
	
	public static void main(String[] args) {
		
		int [] arrenteros = new int [MAX];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			for (int position = 0; position<MAX; position++){
				System.out.println("Ingrese un entero: ");
				/*arrenteros es un arreglo, arrenteros[position] es como una
				variable de tipo entero a la que se le asigna un valor
				*/
				arrenteros[position] = Integer.valueOf(entrada.readLine());
			}
			
			for(int position = 0; position<MAX; position++){
				System.out.println("arrenteros[" + position + "] -> " + arrenteros[position]);
			}
		}
		
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}

}
