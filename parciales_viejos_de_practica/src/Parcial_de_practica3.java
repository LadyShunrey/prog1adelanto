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
		int columna = 0;
		while(columna<MAXCOLUMNA){
			//encontrar una secuencia:
			//si estoy en un número y en columna-1 tengo un cero
				//MIENTRAS que columna != 0
					//ir sumando todo el contenido hasta el proximo cero
					//ir sumando el tamaño de la secuencia hasta el proximo cero
					//ir buscando el mayor par hasta el proximo cero
					//ir buscando el mayor número sea par o impar (aunque el enunciado dice que son todos pares)
					//si columna+1 = cero
						//promedio del contenido = suma de todo el contenido / tamaño de la secuencia
						//si suma de todo el contenido es < numeroIngresado && promedio > mayor numero (que entiendo que también podria ser el mayor par porque no hay impares)
							//reemplazar en la pos del mayor par con la suma de todo el contenido
						//suma del contenido = 0;
						//suma de tamaño = 0;
						//mayor par = 0;
						//mayor numero = 0;
			columna++;	
		} 
	}

}
