/* Realizar un programa que dado dos números enteros ingresados por el usuario, muestre por pantalla el resultado de las operaciones matemáticas
básicas: la suma, la resta, la multiplicación y la división entre ambos números.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase6_ejemplo9 {
	public static void main(String[] args) {
		int numeroIngresado1;
		int numeroIngresado2;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Por favor ingrese un número entero: ");
			numeroIngresado1 = Integer.valueOf(entrada.readLine());
			System.out.println("Por favor ingrese otro número entero: ");
			numeroIngresado2 = Integer.valueOf(entrada.readLine());
			imprimir_operaciones(numeroIngresado1, numeroIngresado2);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void imprimir_operaciones(int numero1, int numero2){
		System.out.println("La suma de "+numero1+" y de "+numero2+" es igual a " + (numero1+numero2));
		System.out.println("La resta de "+numero1+" y de "+numero2+" es igual a " + (numero1-numero2));
		System.out.println("La multiplicación de "+numero1+" con "+numero2+" es igual a " + (numero1*numero2));
		System.out.println("La división de "+numero1+" con "+numero2+" es igual a " + (numero1/numero2));
	}
}
