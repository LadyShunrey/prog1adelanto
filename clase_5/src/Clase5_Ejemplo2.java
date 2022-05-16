//Hacer un programa que mientras que el usuario cargue un numero entero distinto de 0 lo imprima

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase5_Ejemplo2 {

	public static void main (String[] args){
		
		int numero;
		//la declaracion de buffer entrada la ubico al principio junto con las otras declaraciones
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			//el usuario carga un valor la primera vez
			System.out.println("Ingrese un entero (0 para salir): ");
			numero = Integer.valueOf(entrada.readLine());
			while (numero !=0){
				//si numero es distinto de cero l oimprime, vuelve a pedir su carga y vuelve al while
				System.out.println("El valor ingresado es: " + numero);
				System.out.println("Ingrese un numero entero (0 para salir): ");
				numero = Integer.valueOf(entrada.readLine());
			}
		}
		
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
