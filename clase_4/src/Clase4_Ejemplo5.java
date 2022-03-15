/*Dado un numero entero ingresado por el usuario hacer: 
 * _ imprimir A si el numero es multiplo de 5,
 *  _ o imprimir B si el numero es multiplo de 7,
*_ o imprimir C si el numero es multiplo de 2 y de 3, _ o imprimir el numero
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase4_Ejemplo5 {

	public static void main(String[] args) {

		int numero;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Por favor ingrese un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());
			
			if((numero % 5) == 0){
				System.out.println("A (es divisible por 5)");
			}
			else if ((numero %7) ==0){
				System.out.println("B (es divisible por 7)");
			}
			else if (((numero%2)==0) && ((numero%3)==0)){
				System.out.println("C (es divisible por 2 y por 3");
			}
			else{
				System.out.println("El numero es : " + numero);
			} 
			
		}
		
		catch (Exception exc){
			System.out.println(exc);
		}
		
		
	}

}
