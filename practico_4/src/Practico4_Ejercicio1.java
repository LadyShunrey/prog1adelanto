//Escribir un programa que mientras el usuario ingrese un n�mero entero
//menor que 10 y mayor a 1, muestre por pantalla si el n�mero es m�ltiplo de
//2 y m�ltiplo de 3 simult�neamente. (�Los valores mencionados en el
//enunciado deber�an ser constantes?. De a poco habr�a que definirlos
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
					System.out.println("El n�mero es m�ltiplo de "+par+" y es m�ltiplo de "+tres+" porque es: " +numeroIngresado);
				}
				else{
					System.out.println("El n�mero est� entre "+MIN+" y "+MAX+" pero no es m�ltiplo de "+par+" y " + tres);
				}
				System.out.println("por favor ingrese otro entero: ");
				numeroIngresado = Integer.valueOf(entrada.readLine());
			}
			System.out.println("el n�mero no est� en el rango pedido porque es " + numeroIngresado);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}