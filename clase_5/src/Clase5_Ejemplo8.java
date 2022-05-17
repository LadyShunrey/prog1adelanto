/*Dado un numero entero con valor inicial 3, imprimir la tabla de multiplicar de numero
*/

public class Clase5_Ejemplo8{
	public static void main (String[] args){
		
		final int MAX = 10;
		int numero = 3;
		
		System.out.println("Tabla de multiplicar de: " + numero);
		
		for (int multiplicador = 1; multiplicador <=MAX; multiplicador++) {

			System.out.println(multiplicador +" * "+numero+" = "+(multiplicador *numero));
		}
		
	}
}