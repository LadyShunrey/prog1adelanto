/*Hacer un programa que solicite la carga desde consola de un
numero entero y realice:
_si el numero es positivo, imprima “grande” si es mayor a 100 o “chico “ si
es menor. Además deberá imprimir que el valor es positivo.
_si no lo es, imprima si el numero es par, o si el numero es múltiplo de 3, o
ninguna de las opciones anteriores.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico3_SegundaParte_Ejercicio1 {

	public static void main(String[] args) {

		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			int numero;
			System.out.println("Por favor ingrese un numero entero");
			numero = Integer.valueOf(entrada.readLine());
			
			if(numero>=0){
				System.out.println("El número es positivo");
				if(numero>100){
					System.out.println("El número es GRANDE");
				}
				else if(numero<100){
					System.out.println("El número es CHICO");
				}
				else{
					System.out.println("El número es exactamente 100");
				}
			}
			
			if (numero<0){
				if((numero%2)==0){
					System.out.println("El numero es par");
				}
				else if((numero%3)==0){
					System.out.println("El numero es múltiplo de 3");
				}
				else{
					System.out.println("El numero no es par ni multiplo de 3");
				}
			}
			
		}
		
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}

}
