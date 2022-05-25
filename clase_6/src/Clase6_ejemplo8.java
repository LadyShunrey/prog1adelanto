/* Escribir un programa que dado un numero natural (entero > 0 o >=1) ingresado por el usuario llame un metodo que imprima de forma decreciente
los numeros naturales menores a ese numero ingresado. Finalmente, imprima el numero natural ingresado
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase6_ejemplo8 {
	public static final int CONDICION = 0;
	public static void main(String[] args) {
		int numeroIngresado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un número natural: ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			if(numeroIngresado>CONDICION){
				numeros_menores_decrecientes(numeroIngresado);
				System.out.println("El número ingresado es: " + numeroIngresado);
			}
			else{
				System.out.println("El valor no es válido porque no es un número natural");
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void numeros_menores_decrecientes(int numero){
		for(numero=numero-1; numero>CONDICION; numero--){
			System.out.println("El número es: "+numero);
		}
	}
}



