/*Escribir un programa que mientras el usuario cargue desde teclado un numero distinto de 0, llame a un método
que imprima por pantalla los numeros
entre 1 y 4 de forma creciente
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase6_ejemplo4 {
	
	public static void main (String[]args){
		
		final int CONDICION = 0;
		int numeroIngresado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Por favor ingrese un entero distinto de "+CONDICION+": ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			
			while (numeroIngresado!=CONDICION){
				numerosCreciente();
				System.out.println("Por favor ingrese un entero ("+CONDICION+" para salir): ");
				numeroIngresado = Integer.valueOf(entrada.readLine());
			}	
		}
		
		catch (Exception exc){
			System.out.println(exc);
		}			
	}
	
	public static void numerosCreciente(){
		final int MAX = 4;
		final int MIN = 1;
		for(int numero = MIN; numero <=MAX; numero++){
			System.out.println("el número es: " + numero);
		}
	}
}
