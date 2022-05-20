/*Escribir un programa que llame un método que calcule el promedio de la suma de valores enteres entre 1 y 1000.
Finalmente, el resultado debe mostrarse por pantalla.
*/

public class Clase6_ejemplo3 {
	
	public static void main(String[]args){			
		int promedioFinal;
		promedioFinal = calcular_promedio();
		System.out.println("El promedio es: " + promedioFinal);
	}
	
	public static int calcular_promedio (){
		
		final int MAX = 1000;
		final int MIN = 1;
		int promedio;
		int resultadoSuma = 0;
		for(int numeroASumar = MIN; numeroASumar<=MAX; numeroASumar++){
			resultadoSuma+= numeroASumar;
		}
		
		promedio = resultadoSuma/(MAX-MIN+1); /*en este caso podríamos poner solo MAX*/
		return promedio;
	}
	
}
