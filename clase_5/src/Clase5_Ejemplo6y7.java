/*Dado un numero entero con valor inicial 1, hacer una iteraci�n que haga
incrementar numero de a uno hasta un valor MAX = 5 (constante). Mientras
itera deber� imprimir si numero es par y el valor del numero
independientemente de si es par o no
*/

public class Clase5_Ejemplo6y7 {
	public static void main (String[] args){
		
		final int MAX = 5;
		
		for(int numero = 1; numero<=MAX;numero++){
			System.out.println("El numero es: " + numero);
			
			if((numero%2)==0){
				System.out.println("El n�mero es par");
			}
		}
		
	}
	
}
