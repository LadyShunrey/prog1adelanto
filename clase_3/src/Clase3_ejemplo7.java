/* Escribir un programa que permita el ingreso de dos números enteros por teclado e imprima el resultado de comparar:
*_ el primero es multiplo de 3. _ el primero es multiplo de 5. _ el primero es multiplo del segundo. _ el primero es multiplo de 3 y de 5.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase3_ejemplo7 {
	public static void main(String[] args) {

		int numero1, numero2;
		boolean resultado;

		try{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese un numero entero :");
		numero1 = Integer.valueOf(entrada.readLine());
		System.out.println("Ingrese un numero entero :");
		numero2 = Integer.valueOf(entrada.readLine());
		resultado = ((numero1 % 3)==0);
		System.out.println("el primero es multiplo de 3 :" + resultado);
		resultado = ((numero1 % 5)==0);
		System.out.println("el primero es multiplo de 5 :" + resultado);
		resultado = ((numero1 % numero2)==0);
		System.out.println("el primero es multiplo del segundo :" + resultado);
		resultado = (((numero1 % 3)==0)&&((numero1 % 5)==0));
		System.out.println("el primero es multiplo de 3 y 5 :" + resultado);
		}

		catch (Exception exc){
		System.out.println(exc);
		}
	}
}
