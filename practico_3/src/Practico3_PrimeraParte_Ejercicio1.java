/*Escribir un programa que permita el ingreso de un car�cter y realice:
_ imprima es car�cter d�gito si el car�cter ingresado es car�cter
d�gito,
_ o imprima no es car�cter d�gito*/

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
				System.out.println("El caracter ingresado es un d�gito");
			}
			
			else{
				System.out.println("El caracter inresado NO es un d�gito");
			}
		}
		
		catch (Exception exc){
			System.out.println(exc);
		}
		
		
	}

}
