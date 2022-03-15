/*Dado un caracter ingresado por el usuario hacer:
 * _ imprimir si es caracter minuscula, _ o imprimir si es caracter mayuscula,
*_ o imprimir no es caracter letra
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase4_Ejemplo6 {

	public static void main(String[] args) {
		
		char caracter;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
			System.out.println("Ingrese un caracter ; ");
			caracter = entrada.readLine().charAt(0);
			
			if( ('a'<=caracter)  && (caracter <= 'z') ){
				System.out.println("Es un caracter minuscula");
			}
			
			else if (('A'<=caracter)  && (caracter <= 'Z')){
				System.out.println("Es un caracter mayuscula");
			}
			
			else{
				System.out.println("No es un caracter letra");
			}
		}
		
		catch (Exception exc){
			
		}

	}

}
