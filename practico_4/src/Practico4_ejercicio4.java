/*Escribir un programa que mientras que el usuario ingrese un caracter dígito
o caracter letra minúscula, imprima si es caracter dígito o caracter letra
minúscula, y si es letra minúscula imprimir si es vocal o consonante.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practico4_ejercicio4 {
	public static final char MINNUM = '0';
	public static final char MAXNUM = '9';
	public static final char MINLETRA = 'a';
	public static final char MAXLETRA = 'z';
	public static void main(String[] args) {
		char caracterIngresado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un caracter: ");
			caracterIngresado = entrada.readLine().charAt(0);
			while(((MINLETRA<=caracterIngresado)&&(caracterIngresado<=MAXLETRA))||((MINNUM<=caracterIngresado)&&(caracterIngresado<=MAXNUM))||(caracterIngresado=='ñ')){
				if((MINNUM<=caracterIngresado)&&(caracterIngresado<=MAXNUM)){
					System.out.println("El caracter es un número");
				}
				else{
					switch(caracterIngresado){
					case 'a': case 'e': case 'i': case 'o': case 'u':{
						System.out.println("Es una vocal");
						break;
					}
					default:{
						System.out.println("Es consonante");
					}
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
