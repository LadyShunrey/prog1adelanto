/*Hacer un programa que mientras que el usuario cargue un numero entero entre 1 y 3, imprima el numero y la tabla de multiplicar del numero ingresado
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_Ejemplo9 {
	public static void main (String[] args){
		
		final int MAXMULTIPLICADOR = 10;
		final int MAX = 3;
		final int MIN = 1;
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Por favor ingrese un entero entre " + MIN + " y " + MAX);
			numero = Integer.valueOf(entrada.readLine());
			System.out.println("El número ingresado es: " + numero);
			
			while((numero>=MIN) && (numero<=MAX)){

				System.out.println("Para la tabla del " + numero + " los valores resultantes son: ");
				
				for(int multiplicador = 1; multiplicador <= MAXMULTIPLICADOR ; multiplicador++){					
					System.out.println(multiplicador + " * " + numero + " = " + (multiplicador*numero));
				}
				
				System.out.println("Por favor ingrese un entero entre " + MIN + " y " + MAX);
				numero = Integer.valueOf(entrada.readLine());
				System.out.println("El número ingresado es: " + numero);
			}
			
		
			System.out.println("El numero ingresado no esta entre " + MIN + " y " + MAX);
			
		}
				
		catch(Exception exc){
		System.out.println(exc);
		}
		
	}
}
