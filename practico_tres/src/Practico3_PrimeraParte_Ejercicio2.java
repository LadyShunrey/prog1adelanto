/*Escribir un programa que permita el ingreso de dos números enteros
por teclado y realice:
_ imprima A si el primero mayor al segundo,
_ o imprima B si ambos son múltiplos de 2,
_ o imprima C para ninguna de las opciones anteriores*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico3_PrimeraParte_Ejercicio2 {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Por favor ingrese un numero entero");
			numero1 = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ahora ingrese otro numero entero por favor");
			numero2 = Integer.valueOf(entrada.readLine());	
		
		
			if(numero1 > numero2){
				System.out.println("A! porque numero1 es mayor a numero2");
			}
			
			else if((numero1%2)==0 && (numero2%2)==0){
				System.out.println("B! Porque numero1 y numero2 son múltiplos de 2");
			}
			
			else{
				System.out.println("C! Porque el primero no e mayor al segundo, y porque no son ambos multiplos de dos.");
			}
		}
		
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}

}
