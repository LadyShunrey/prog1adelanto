/*Escribir un programa que ingrese un número entero por teclado y
realice:
_ imprima es múltiplo de 6 y de 7 si cumple con esa condición,
_ o imprima es mayor a 30 y múltiplo de 2 si cumple con esa
condición,
_ imprima si el cociente de la división de dicho número con 5 es
mayor a 10 sin importar las condiciones previas.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico3_PrimeraParte_Ejercicio3 {

	public static void main(String[] args) {

		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));

			int numero;
			System.out.println("Por favor ingrese un número entero");
			numero = Integer.valueOf(entrada.readLine());
			
			if (((numero%6)==0) && ((numero%7)==0)){
				System.out.println("Es múltiplo de 6 y de 7");
			}
			else if ((numero>30) && ((numero%2)==0)){
				System.out.println("Es mayor a 30 y múltiplo de 2");
			}
			
			if ((numero/5) > 10){
				System.out.println("La división del número por 5 es mayor a 10");
			}
		}
		
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}

}
