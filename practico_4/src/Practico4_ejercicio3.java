/*Escribir un programa que mientras que el usuario ingrese un número entero
distinto de 0, pida ingresar otro número entero y lo imprima.*/

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
				System.out.println("Ingrese otro número entero, o " + CONDICION + " para salir: ");
				numeroIngresado = Integer.valueOf(entrada.readLine());
				System.out.println("El número ingresado es: "+numeroIngresado);
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
