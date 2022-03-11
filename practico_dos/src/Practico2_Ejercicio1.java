//Consigna:
//Escribir un programa que permita el ingreso de un número entero
//por teclado e imprima el cociente de la división de dicho número
//con 2, 3, y 4.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico2_Ejercicio1 {

	public static void main(String[] args) {
		
		//ingresar un entero
		//dividirlo y mostrar la division con 2
		//divirlo y mostrar la division con 3
		//dividirlo y mostrar la division con 4
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			int numero;
			
			System.out.println("Ingrese un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());
			System.out.println("El número elegido es: " + numero);
			
			System.out.println("Ese número dividido por dos = " + (numero / 2));
			System.out.println("Ese número dividido por tres = " + (numero / 3));
			System.out.println("Ese número dividido por cuatro = " + (numero / 4));

		}
		
		catch (Exception exc){
			System.out.println(exc);
		}
		
	}

}
