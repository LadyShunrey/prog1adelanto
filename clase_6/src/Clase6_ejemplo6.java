/*Escribir un diseno de un programa que mientras el usuario ingrese de un numero entero mayor
 *  que 0, imprima la tabla de multiplicar de 10. Cuando salga del ciclo vuelva a imprimir
la tabla de multiplicar de 10.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase6_ejemplo6 {
	public static final int CONDICION = 0;
	public static final int MAX = 10;
	public static final int MIN = 1;
	public static void main(String[] args) {		
		int numeroIngresado;
		numeroIngresado = ingresar_numero();
		while(numeroIngresado > CONDICION){
			//imprimir tabla de multiplicar de 10 de ese numero
			int multiplicador = multiplicador();
			System.out.println(numeroIngresado + " * " + multiplicador + " = " + (numeroIngresado * multiplicador));
			numeroIngresado = ingresar_numero();
		}		
		//imprimir la tabla	
	}
	public static int ingresar_numero(){
		int numeroIngresado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un entero: ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			System.out.println("El entero ingresado es: " + numeroIngresado);
		}	
		catch(Exception exc){
			System.out.println(exc);
			numeroIngresado = -1;
			System.out.println("El valor es inválido así que ahora el numero ingresado es: " + numeroIngresado);
		}		
		return numeroIngresado;
	}	
	public static int multiplicador(){
		for(int multiplicador = MIN; multiplicador <= MAX; multiplicador++){
			return multiplicador;
		}
	}
}
