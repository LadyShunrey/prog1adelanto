/*Escribir un programa que mientras que el usuario ingrese un n�mero entero
distinto de 0, pida ingresar otro n�mero entero y lo imprima.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practico4_ejercicio3{
	public static final int CONDICION = 0;
	public static void main (String[] args){
		int numeroIngresado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un entero distinto de " + CONDICION);
			numeroIngresado = Integer.valueOf(entrada.readLine());
			while(numeroIngresado!=CONDICION){
				System.out.println("Ingrese otro n�mero entero, o " + CONDICION + " para salir: ");
				numeroIngresado = Integer.valueOf(entrada.readLine());
				System.out.println("El n�mero ingresado es: "+numeroIngresado);
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
