/* Suponer que se tienen dos matrices A y B de secuencias (de enteros naturales separados por ceros)
de tamanio MAXFIL x MAXCOL (cada fila empieza y termina con ceros),
que estan precargadas, y ademas se tiene/n el/los siguiente/s metodo/s (se supone que existe/n y esta/n implementado/s):

_un metodo que retorna el indice inicial de la secuencia que tiene mas numeros impares repetidos de un arreglo de
secuencias (de enteros naturales separados por ceros) de tamanio MAXCOL (que empieza y termina con ceros).

_un metodo que permite obtener el indice inicial de la secuencia previa a la secuencia central (central porque justo al medio del
arreglo esta parte de esa secuencia) de un arreglo de secuencias (de enteros naturales separados por ceros) de tamanio
MAXCOL (que empieza y termina con ceros).

Se pide realizar un programa completo que (sin utilizar arreglos o matrices auxiliares extras a las mencionadas, ni realizar declaraciones
explícitas de las matrices):
_contenga la definicion de el/los encabezado/s de el/los metodo/s mencionado/s como preexistente/s que figura/n en el enunciado
(excepto los de carga de datos en matrices, que solamente se invocan).
_para cada fila de A elimine la secuencia con mas numeros impares repetidos de la fila, si la misma tiene cantidad par de impares y ademas
es igual a la secuencia previa a la secuencia central de dicha fila en B.
*/

//----------------------------------------------------------------------------------------------------------

//import java.util.Random; (si hubiera que cargar las matrices) y otras librerías que sean necesarias para la carga de las matrices y los métodos preexistentes.
public class Parcial_de_practica1 {
	public static final int MAXFIL = 15; //le pongo valores aleatorios para poder trabajarlas
	public static final int MAXCOL = 50; //le pongo valores aleatorios para poder trabajarlas
	public static void main (String[]args){
		int [][]matrizA = new int [MAXFIL][MAXCOL];
		int [][]matrizB = new int [MAXFIL][MAXCOL];
		cargar_matriz_secuencias_int(matrizA);
		cargar_matriz_secuencias_int(matrizB);
		
		//para cada fila de A
		for (int fila = 0; fila<MAXFIL;fila++){
			eliminar_secuencia_impares_repetidos(matrizA, matrizB, fila);
		}
	}
	
	public static void eliminar_secuencia_impares_repetidos(int [][]matrizA, int[][]matrizB, int fila){
		int inicioSecuenciaImpares, inicioSecuenciaAnteriorCentral, contadorDeImpares = 0, tamanio=0, finSecuenciaImpares;
		//encontrar la secuencia con más impares repetidos de esa fila
		inicioSecuenciaImpares = retornar_inicio_secuencia_impares_repetidos(matrizA[fila]);
		//encontrar el inicio de la secuencia B que es la anterior a la central
		inicioSecuenciaAnteriorCentral = retornar_inicio_secuencia_previa_central(matrizB[fila]);
		//iterar las columnas hasta llegar a un cero
		int columnaA = inicioSecuenciaImpares;
		int columnaB = inicioSecuenciaAnteriorCentral;
		while ((columnaA<MAXCOL) && (columnaB<MAXCOL) && (matrizA[fila][columnaA] == matrizB[fila][columnaB])){
			//iterar las columnas
			//ir contando el tamaño
			tamanio++;
			if (matrizA[fila][columnaA] %2!=0){
				//Ir contando cantidad de impares
				contadorDeImpares++;
			}
			if((matrizA[fila][columnaA+1] == 0) && (matrizB[fila][columnaB+1]==0)){
				if ((contadorDeImpares%2)==0){
					finSecuenciaImpares= columnaA;
					//si esa secuencia tiene cantidad PAR de numeros impares YY si además es igual a la secuencia previa de la central en la misma fila B
					eliminar_esta_secuencia(matrizA, inicioSecuenciaImpares, tamanio, fila, finSecuenciaImpares);
					//eliminarla
					
				}
				//salir
				columnaA = MAXCOL;
			}
			columnaA++;
			columnaB++;
		}
	}
	
	public static void eliminar_esta_secuencia(int [][]matrizA, int inicioSecuenciaImpares, int tamanio, int fila, int finSecuenciaImpares){
		int cantidadDeCorridas =0;
		while (cantidadDeCorridas<tamanio){
				correr_a_izquierda(matrizA, fila, inicioSecuenciaImpares, finSecuenciaImpares);
		}
	}
	
	public static void correr_a_izquierda(int[][]matrizA, int fila, int inicioSecuenciaImpares, int finSecuenciaImpares){
		for (int columna = inicioSecuenciaImpares;columna<=finSecuenciaImpares; columna++){
			matrizA[fila][columna]=matrizA[fila][columna+1];
		}
	}
	
	public static int retornar_inicio_secuencia_impares_repetidos(int [] arreglo){
		//...
	}
	
	public static int retornar_inicio_secuencia_previa_central(int[]arreglo){
		//...
	}
}
