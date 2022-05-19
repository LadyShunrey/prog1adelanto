//Escribir un programa que mientras el usuario ingrese un número entero
//menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
//2 y múltiplo de 3 simultáneamente. (¿Los valores mencionados en el
//enunciado deberían ser constantes?. De a poco habría que definirlos
//como constantes).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico4_Ejercicio1{
	public static void main(String[]args){
		
		final int MAX = 10;
		final int MIN = 1;
		final int par = 2;
		final int tres = 3;
		int numeroIngresado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese un entero: ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			while((numeroIngresado<MAX) && (numeroIngresado>MIN)){
				if(((numeroIngresado%par)==0)&&((numeroIngresado%tres)==0)){
					System.out.println("El número es múltiplo de "+par+" y es múltiplo de "+tres+" porque es: " +numeroIngresado);
				}
				else{
					System.out.println("El número está entre "+MIN+" y "+MAX+" pero no es múltiplo de "+par+" y " + tres);
				}
				System.out.println("por favor ingrese otro entero: ");
				numeroIngresado = Integer.valueOf(entrada.readLine());
			}
			System.out.println("el número no está en el rango pedido porque es " + numeroIngresado);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}