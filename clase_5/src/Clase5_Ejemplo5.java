/*Hacer un programa que mientras que el usuario cargue un numero entero distinto de 0 lo
imprima
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_Ejemplo5{
	public static void main(String[] arg){
		
		int numero;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			
			do{
				System.out.println("Por favor ingrese un entero: ");
				numero = Integer.valueOf(entrada.readLine());
				System.out.println("El número elegido es: " + numero);
				System.out.println("El numero es distinto de cero porque es: " + numero);
			}while(numero!=0);
			
		}
		
		catch (Exception exc){
			System.out.println(exc);
		}
		
		
	} 
}