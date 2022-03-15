
public class Clase4_Ejemplo8 {
	public static void main(String[] args) {
		
		/*Dado un valor, verificar e imprimir si es par o impar. En el caso de que sea
		*par verificar e imprimir si es mayor de 4 o no lo es
		*/
		
		int valor = 5;
		
		if (valor % 2 == 0) {

			System.out.println(valor + " es par");
			
			if (valor > 4) {

				System.out.println(valor + " es mayor que 4");

			}
			
			else {

				System.out.println(valor + " es menor o igual que 4");

			}

		}
		
		else{

			System.out.println(valor + " es impar");
	
		}
	}
}