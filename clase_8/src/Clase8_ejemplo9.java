/*Hacer un programa que dado la matriz definida y precargada, imprima lo que suma el
contenido de cada secuencia.
*/
//importo librerías necesarias para el código: Voy a necesitar la RANDOM nomás creo.
import java.util.Random;
public class Clase8_ejemplo9{
	//declaro las constantes
	public static final int MAXFILA = 10;
	public static final int MAXCOLUMNA = 10;
	public static final double PROBABILIDAD_NUMERO = 0.4;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		//QUE TENGO QUE HACER:
		//declaro la matriz
		int [][] matriz = new int [MAXFILA][MAXCOLUMNA]; 
		//la cargo con secuencias de enteros
		cargar_la_matriz_con_secuencias_de_enteros(matriz);
		//la imprimo
		imprimir_la_matriz(matriz);
		//llamo el método que sume el contenido de cada secuencia
		sumar_el_contenido_secuencias_matriz(matriz);
	}
	//acá declaro el método que suma:
	public static void sumar_el_contenido_secuencias_matriz(int [][] matriz){
		//itero la matriz por fila
		int suma = 0;
		int cantidadDeSecuencias = 0;
		for (int fila = 0; fila < MAXFILA; fila++){
			//itero por columna
			for (int columna = 1; columna < MAXCOLUMNA; columna++){
				//si valor != 0
				if (matriz[fila][columna] != 0){
					//actualizo la variable suma
					suma += matriz[fila][columna]; 
					//si antes hubo un cero es inicio de secuencia
					if (matriz[fila][columna-1] == 0){
						//contador de numero de secuencia +1
						cantidadDeSecuencias += 1;			
					}
				}
				//si estoy en un cero
				if (matriz[fila][columna] == 0){
					//si antes hubo !=0
					if (matriz [fila][columna-1] != 0){
						//devolver total suma
						System.out.println("La suma total del contenido de la secuencia " + cantidadDeSecuencias + " es " + suma);
						suma = 0;
					}
				}
			}
		}
	}	
	//método que carga
	public static void cargar_la_matriz_con_secuencias_de_enteros(int [][] matriz){
		for (int fila = 0; fila < MAXFILA; fila++){
			Random r = new Random();
			matriz[0][0] = 0;
			matriz[0][MAXCOLUMNA-1] = 0;
			for (int columna = 1; columna < MAXCOLUMNA-1; columna++){
				if (r.nextDouble()>PROBABILIDAD_NUMERO){
					matriz[fila][columna]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR); 
				}
				else{
					matriz[fila][columna]=0;				
				}
			}
		}
		System.out.println("");
	}
	//método que imprime
	public static void imprimir_la_matriz(int[][]matriz){
		for(int fila = 0; fila<MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna<MAXCOLUMNA;columna++){
				System.out.print(matriz[fila][columna] + "|");
			}
			System.out.println("");
		}
	}
}
