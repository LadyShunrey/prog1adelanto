/*Dado un numero entero con valor inicial 1, hacer una iteración que haga
incrementar numero de a uno hasta un valor MAX = 5 (constante). Mientras
itera deberá imprimir si numero es par
*/

public class Clase5_Ejemplo4{
	public static void main (String[]args){
		
		final int MAX = 5;
		int numero = 1;
		System.out.println("el numero inicial es: " + numero);
		
		do{
			System.out.println("el numero es: " + numero);
			if ((numero%2)==0){
				System.out.println("El numero es par porque es " + numero);
			}
			
			numero++;
			
			System.out.println("el numero incrementado es: " + numero);
			
		} while (numero <= MAX);
		
	}
}