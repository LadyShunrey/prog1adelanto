/*Hacer un programa que mientras que el usuario cargue un numero entero entre 0 y 1000 (no incluidos),
guarde el menor de los numeros ingresados. Al finalizar el ciclo imprima el menor por pantalla
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_Ejemplo10{
	public static void main (String[] arg){
		
		final int MAX = 1000;
		final int MIN = 0;
		int numeroMenor = MAX;
		int numeroIngresado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese un entero entre "+MIN+" y "+MAX+": ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			System.out.println("El número ingresado es: " + numeroIngresado);
			
			while((numeroIngresado>MIN) && (numeroIngresado<MAX)){
	
				if(numeroIngresado<numeroMenor){
					numeroMenor = numeroIngresado;
				}
				System.out.println("El nuevo número menor es: " + numeroMenor);					
				System.out.println("Ingrese un entero entre "+MIN+" y "+MAX+": ");
				numeroIngresado = Integer.valueOf(entrada.readLine());
				System.out.println("El número ingresado es: " + numeroIngresado);
								
			}
			
			System.out.println("El número ingresado no está en el rango pedido porque es: " + numeroIngresado);
		}
		
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}
}