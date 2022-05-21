//Escribir un programa que mientras el usuario ingresa un caracter distinto
//del caracter ‘*’, muestre por pantalla si es caracter digito, o si es caracter
//vocal minúscula.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico4_ejercicio2{
	public static void main (String[]args){
		final char CONDICION = '*';
		final char MIN = '0';
		final char MAX = '9';
		char caracterIngresado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese un caracter distinto de *: ");
			caracterIngresado = entrada.readLine().charAt(0);
			while(caracterIngresado!=CONDICION){
				if((caracterIngresado>=MIN)&&(caracterIngresado<=MAX)){
					System.out.println("el caracter es un dígito: " + caracterIngresado);
				}
				else{
					System.out.println("el caracter no es un dígito: " + caracterIngresado);
				}
				switch(caracterIngresado){
				case 'a': case 'e': case 'i': case'o': case 'u':{
					System.out.println("el caracter es una vocal minuscula: " + caracterIngresado);
					break;
				}
				default:{
					System.out.println("el caracter no es una vocal minuscula");
				}
				}
				System.out.println("Ingrese otro caracter: ");
				caracterIngresado = entrada.readLine().charAt(0);
			}
		}
		
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
