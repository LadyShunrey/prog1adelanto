/*Hacer un programa que dado el arreglo definido y precargado, imprima lo que suma el contenido de cada secuencia.
*/

import java.util.Random;

public class Clase7_ejemplo8 {
	
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final int MAX = 10;
	public static final double PROBABILIDAD_NUMERO = 0.4;
	
	public static void main(String[] args) {
		int [] arregloDeSecuencias = new int[MAX];
		cargar_el_arreglo_aleatorio_de_secuencias(arregloDeSecuencias);
		imprimir_el_arreglo_aleatorio_de_secuencias(arregloDeSecuencias);
		imprimir_la_suma_de_cada_secuencia(arregloDeSecuencias);
		ordenar_arreglo(arregloDeSecuencias);
		imprimir_el_arreglo_aleatorio_de_secuencias(arregloDeSecuencias);
	}
	
	public static void imprimir_la_suma_de_cada_secuencia(int [] arregloDeSecuencias){
		int suma = 0;
		for (int laPosicion = 0; laPosicion>MAX; laPosicion++){
		//encuentre una secuencia
		//si el valor es cero hacer pos ++
			while (arregloDeSecuencias[laPosicion]==0){ /*o while tengo que ver bien*/ 
				System.out.println("En la posicion "+laPosicion+" hay un separador (0) de la secuencia");
				laPosicion++;
				
				while (arregloDeSecuencias[laPosicion]!=0){
					suma += arregloDeSecuencias[laPosicion];
				}
				
				System.out.println("Esta secuencia de como suma: " + suma);
			}
		}
			
		// si el valor es distinto de cero sumar a variable suma
		//los imprima
		// busque otra secuencia
	}
	
	public static void cargar_el_arreglo_aleatorio_de_secuencias(int[]arregloDeSecuencias){
		Random r = new Random();
		arregloDeSecuencias[0] = 0;
		arregloDeSecuencias[MAX-1] = 0;
		
		for (int laPosicion = 1; laPosicion < MAX-1; laPosicion++){
			if (r.nextDouble()>PROBABILIDAD_NUMERO){
				arregloDeSecuencias[laPosicion]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
		
			else{
				arregloDeSecuencias[laPosicion]=0;
		
			}
		}
	}
	
	public static void imprimir_el_arreglo_aleatorio_de_secuencias(int[]arregloDeSecuencias){
		System.out.print("El arreglo de secuencias aleatorio int es\n|");
		for (int laPosicion = 0; laPosicion < MAX; laPosicion++){
			System.out.print(arregloDeSecuencias[laPosicion]+"|");
		}
		System.out.print("\n");	
	}
	
	public static void ordenar_arreglo(int [] arreglo){
		for(int i = 0; i <MAX;i++){
			for (int j=i+1; j<MAX;j++){
				if (arreglo[i]>arreglo[j]){
					int aux = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = aux;
				}
			}
		}
		
	}

}
