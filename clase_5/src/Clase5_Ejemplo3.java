/*Hacer un programa que mientras que el usuario cargue un numero entero distinto de 0 lo imprima si es par
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_Ejemplo3{
	public static void main (String[] arg){
		
		int numero;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			
			System.out.println("Por favor ingrese un entero (cero para salir): ");
			numero = Integer.valueOf(entrada.readLine());
			System.out.println("el numero elegido es: " + numero);
			
			while(numero!=0){
				System.out.println("el numero es distinto de cero");
				
				if((numero%2)==0){
					System.out.println("el numero es par");
				}
				
				else{
					System.out.println("el numero es impar");
				}
				
				System.out.println("Por favor ingrese un entero: ");
				numero = Integer.valueOf(entrada.readLine());
			}
			
			System.out.println("el numero es cero");
		}
		
		catch (Exception exc){
			System.out.println(exc);
		}
	}
}