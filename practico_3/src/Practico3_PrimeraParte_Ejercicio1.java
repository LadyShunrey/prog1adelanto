/*Escribir un programa que permita el ingreso de un carácter y realice:
_ imprima es carácter dígito si el carácter ingresado es carácter
dígito,
_ o imprima no es carácter dígito*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico3_PrimeraParte_Ejercicio1 {

	public static void main(String[] args) {

		/*pedir ingresar un caracter o digito, si es caracter digito o imprimir no es digito*/
		char caracter;
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			
			System.out.println("Ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
			
			
			if((caracter>='0') && (caracter<='9')){
				System.out.println("El caracter ingresado es un dígito");
			}
			
			else{
				System.out.println("El caracter inresado NO es un dígito");
			}
		}
		
		catch (Exception exc){
			System.out.println(exc);
		}
		
		
	}

}
