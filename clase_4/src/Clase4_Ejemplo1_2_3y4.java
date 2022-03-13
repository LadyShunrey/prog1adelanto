/*Imprime si un valor es par. Además imprime el valor */

public class Clase4_Ejemplo1_2_3y4 {

	public static void main(String[] args) {

		int valor = 5;
		if ((valor % 2) == 0){
			System.out.println(valor + " es par.");
		}
		
		else if ((valor % 3) == 0) {
			System.out.println(valor + " es multiplo de 3");
		}
		
		else {
			System.out.println(valor + " no es par y no es multiplo de 3.");
		}
		
		System.out.println("El valor es " + valor);
	}

}
