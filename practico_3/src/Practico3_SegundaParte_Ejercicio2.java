/*Hacer un programa que solicite la carga desde consola de
un carácter y realice: imprima si es dígito, o letra minúscula, o
es cualquier otro carácter. Si es letra minúscula indicar si es
vocal o consonante.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico3_SegundaParte_Ejercicio2 {

	public static void main(String[] args) {
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			char caracter;
			System.out.println("Por favor ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
		
			if((caracter>='0') && (caracter<='9')){
				System.out.println("El caracter es un dígito");
			}
			else if ((caracter>='a')&&(caracter<='z')){
				System.out.println("El caracter es una letra minúscula");
				
				switch(caracter){
					case 'a': case 'e': case 'i': case 'o': case 'u':{
						System.out.println("El caracter es una vocal");
						break;
					}
					default: {
						System.out.println("el caracter es una consonante");
					}
				}
			}
			else{
				System.out.println("No es un digito, ni una letra minúscula");
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}

}
