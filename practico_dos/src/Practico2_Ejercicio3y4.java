// parte 3: Escribir un programa que permita el ingreso de dos n�meros
// enteros por teclado e imprima el resultado de comparar:
// _ el primero mayor al segundo.
// _ ambos son m�ltiplos de 2.
/* parte 4: Escribir un programa que ingrese un n�mero entero por teclado e
imprima el resultado de determinar:
_ es m�ltiplo de 6 y de 7,
_ es mayor a 30 y m�ltiplo de 2, o es menor igual a 30,
_ el cociente de la divisi�n de dicho n�mero con 5 es mayor a 10.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico2_Ejercicio3y4 {

	public static void main(String[] args) {
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			int numero1;
			int numero2;
			int numero3;
			
			System.out.println("Ingrese un numero entero: ");
			numero1 = Integer.valueOf(entrada.readLine());
			System.out.println("El n�mero elegido es: " + numero1);
			
			System.out.println("Ingrese otro numero entero: ");
			numero2 = Integer.valueOf(entrada.readLine());
			System.out.println("El n�mero elegido es: " + numero2);
			
			System.out.println("El primero mayor al segundo = " + (numero1>numero2));
			System.out.println("Ambos son m�ltiplos de 2 = " + (((numero1%2)==0) && ((numero2%2)==0)));

			
			System.out.println("Ahora vamos a continuear con el punto 4, por favor ingrese un �ltimo numero entero: ");
			numero3 = Integer.valueOf(entrada.readLine());
			System.out.println("El n�mero elegido es: " + numero3);
			
			System.out.println("Es m�ltiplo de 6 y de 7 = " + (((numero3%6)==0) && ((numero3%7)==0)));
			System.out.println("Es mayor a 30 y m�ltiplo de 2, o es menor igual a 30 = " + (((numero3>30)&&((numero3%2)==0)) || (numero3<=30)) );
			System.out.println("El cociente de la divisi�n de dicho n�mero con 5 es mayor a 10 = " + ( (numero3 / 5) > 10 ) );
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}

}
