
//importación de dos librerias de operaciones de
//entrada/salida y carga de una variable de tipo entero desde consola

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase2_ejemplo7y8juntos {

	public static void main(String[] args) {
		
		//declaro la variable donde quiero cargar el calor ingresado
		
		int entero;
		float flotante;
		double doble;
		char caracter;
		
		try{
		//try define un bloque {...} para capturar posibles errores o excepciones
			//puedo utilizar el mismo buffer entrada más de una vez o por cada carga desde consola
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			//imprimo por consola un mensaje que indique al usuario el calor a ingresar
			System.out.println("Ingrese un entero: ");
			
			//cuando se ejecuta Integer.valueOf(entrada.readLine()) sobre la pantalla de la consola aparece
			// un cursor en espera de que el usurario ingrese un dato
			//Una vez que lo tipea y aprieta enter el valor ingresado se convierte a un valor entero
			entero = Integer.valueOf(entrada.readLine()); //la sentencia Integer.valueOf() convierte a int
			
			System.out.println("Ingrese un float: ");
			flotante = Float.valueOf(entrada.readLine()); //la sentencia Float.valueOf() convierte a float
			
			System.out.println("Ingrese un double: ");
			doble = Double.valueOf(entrada.readLine()); //la sentencia Double.valueOf() convierte a double
			
			System.out.println("Ingrese un char: ");
			//para convertir/acceder al caracter la sentencia es diferente
			caracter = entrada.readLine().charAt(0);
																			
			//imprimo por consola un mensaje con el valor de la variable entero
			System.out.println("El entero ingresado es: " + entero);
			System.out.println("El float ingresado es: " + flotante);
			System.out.println("El double ingresado es: " + doble);
			System.out.println("El char ingresado es: " + caracter);
		}
		
		catch (Exception exc ){
		//catch define un bloque {...} que se ejecuta solo cuando ocurre un
		//error en el bloque del try, 
		//exc es una variable de tipo Exception (tipo predefinido de Java)
		//cuyo valor es el tipo de error.
			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);
			//asd
		}
	
		
		
	}	
}
