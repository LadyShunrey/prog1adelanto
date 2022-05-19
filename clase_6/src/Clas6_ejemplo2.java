//Hacer un método que dado un numero entero
//con valor inicial 1, haga una iteración incrementando
//numero de a uno hasta un valor MAX = 4 (constante).
//Mientras itera deberá imprimir numero. Luego invocarlo
//desde el programa principal y cuando termina imprimir por
//pantalla “termino”.

public class Clas6_ejemplo2 {

	public static void main(String[] args) {
		
		imprimir_1_a_4 ();
		System.out.println("Termino");
		
	}
	
	public static void imprimir_1_a_4 (){
		
		final int MAX  = 4;
		for(int numero=1;numero<=MAX;numero++){
			System.out.println("El número es: " + numero);
		}
		
	}

}
