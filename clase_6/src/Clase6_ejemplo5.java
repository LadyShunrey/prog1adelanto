/* Similar a Clase_6_Ejemplo_3. Escribir un programa que llame un método que calcule el promedio de la suma
de valores enteres entre 1 y 1000. Finalmente, el promedio debe mostrarse por pantalla. variable global constante
*/

public class Clase6_ejemplo5 {

	public static final int MAX =1000;
	public static final int MIN = 1;
	
	public static void main(String[]args){			
		int promedioFinal;
		promedioFinal = calcular_promedio();
		System.out.println("El promedio de la suma es: " + promedioFinal);
	}
	
	public static int calcular_promedio (){
		int promedio;
		int resultadoSuma = 0;
		for(int numeroASumar = MIN; numeroASumar<=MAX; numeroASumar++){
			resultadoSuma+= numeroASumar;
		}
		
		promedio = resultadoSuma/(MAX-MIN+1); /*en este caso podríamos poner solo MAX*/
		return promedio;
	}
	
}
