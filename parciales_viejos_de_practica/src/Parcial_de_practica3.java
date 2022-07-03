/*Sea una matriz de enteros de tamanio 10*30 de secuencias de numeros pares entre 1 y 9 (por cada fila), separadas por ceros. 
La matriz esta precargada (no implementar el metodo de carga), y ademas cada fila empieza y termina con uno o mas separadores 0.
Se pide realizar un programa que:

_dado un numero ingresado por el usuario, reemplace de cada secuencia el mayor valor par que posee por lo que suma el contenido de la secuencia, 
si dicha suma es menor al numero ingresado y el promedio entero del contenido de la secuencia es menor al mayor valor que posee la
secuencia.*/

//-------------------------------------------------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
//importar librerias necesarias para los métodos preexistentes;
public class Parcial_de_practica3 {
	public static final int MAXFILA = 10;
	public static final int MAXCOLUMNA = 30;
	public static void main(String[] args) {
		int numeroIngresado;
		int [][]matriz = new int [MAXFILA][MAXCOLUMNA];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//cargar_la_matriz_secuencias_int(matriz);
		try{
			System.out.println("Por favor ingrese un numero: ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			for (int fila=0; fila < MAXFILA; fila++){
				reemplazar_en_cada_secuencia(matriz, fila, numeroIngresado);
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	public static void reemplazar_en_cada_secuencia(int[][]matriz, int fila, int numeroIngresado){
		int columna = 0, sumaDelContenido = 0, sizeSecuencia = 0, elMayorPar = 0, promedio = 0;
		while(columna<MAXCOLUMNA){
			//encontrar una secuencia:
			//si estoy en un número y en la anterior tengo un cero
			if ((matriz[fila][columna]!=0) && (matriz[fila][columna-1]==0)){
				//MIENTRAS que columna != 0
				while (matriz[fila][columna]!=0){	
					//ir sumando todo el contenido hasta el proximo cero
					sumaDelContenido += matriz[fila][columna];
					//ir sumando el tamaño de la secuencia hasta el proximo cero
					sizeSecuencia++;
					//ir buscando el mayor par hasta el proximo cero
					if (((matriz[fila][columna]%2)==0) && (matriz[fila][columna]>elMayorPar)){
						elMayorPar = matriz[fila][columna];
					}
					
					//si columna+1 = cero
					if (matriz[fila][columna+1]==0){
						//promedio del contenido = suma de todo el contenido / tamaño de la secuencia
						promedio = sumaDelContenido / sizeSecuencia;
						//si suma de todo el contenido es < numeroIngresado && promedio < mayor numero (que entiendo que también podria ser el mayor par porque no hay impares)
						if ((sumaDelContenido < numeroIngresado) && (promedio < elMayorPar)){
							//reemplazar en la pos del mayor par con la suma de todo el contenido
						}
						//suma del contenido = 0;
						sumaDelContenido = 0;
						//suma de tamaño = 0;
						sizeSecuencia = 0;
						//mayor par = 0;
						elMayorPar = 0;
					}
					columna++;
				}
			}
			
			else {
				columna++;
			}
		} 
	}
/*_dado un numero ingresado por el usuario, reemplace de cada secuencia el mayor valor par que posee por lo que suma el contenido de la secuencia, 
si dicha suma es menor al numero ingresado y el promedio entero del contenido de la secuencia es menor al mayor valor que posee la
secuencia.*/
}
