/*Escribir un programa que dado un numero ingresado por el usuario, si el numero es natural imprima la tabla de multiplicar de ese numero.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase6_ejemplo7 {
	public static final int CONDICION = 0;
	public static final int MIN = 1;
	public static final int MAX = 10;
	public static void main (String[]args){
		int numeroIngresado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un número natural: ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			if(numeroIngresado>CONDICION){
				imprimir_tabla_de_numero(numeroIngresado);
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	public static void imprimir_tabla_de_numero(int numero){
		for(int multiplicador = MIN; multiplicador <=MAX; multiplicador++){
			System.out.println(numero+ " * " + multiplicador + " = " + numero*multiplicador);
		}
	}
}
