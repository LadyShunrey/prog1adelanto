
public class Clase2_ejemplo3 {

	public static void main(String[] args) {
		// ejemplo de declaración de variables y asignación de valores
		
		int edad;
		double altura, peso;
		int numero;
		float pes;
		//se puede asignar un valor a unaa variable en la declaración
		boolean existe = false;
		numero = 30;
		//una variable puede tomar el valor de otra variable de igual tipo
		edad = numero;
		altura = 1.7;
		peso = 75.5;
		//una variable de tipo float necesita especificar su tipo sobre el valor que toma (75.5 es un valor double por defecto)
		pes = (float) 75.5;

		// imprime dos textos concatenados
		System.out.println("El valor de " + "peso es: ");
		
		//imprime el valor de peso convertido en texto
		System.out.println(peso);
		
		//imprime un texto concatenado con el valor de peso convertido en texto
		System.out.println("El valor  de peso es: " + peso);
	}

}
