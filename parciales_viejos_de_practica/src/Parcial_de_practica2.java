/*Suponer que se tienen dos matrices A y B de secuencias (de caracteres letras minusculas separados por espacios) de tamanio
MAXFIL x MAXCOL (cada fila empieza y termina con caracteres espacios), que estan precargadas, y ademas se tiene/n el/los
siguiente/s metodo/s (se supone que existe/n y esta/n implementado/s):

_un metodo que de un arreglo de secuencias (de caracteres letras minusculas separados por espacios) de tamanio MAXCOL (que empieza y
termina con espacios), retorna en cuantas secuencias de dicho arreglo esta incluida una secuencia que se encuentra en otro arreglo
(de caracteres letras minusculas separados por espacios) de tamanio MAXCOL (que empieza y termina con espacios), que tiene una unica secuencia.

_un metodo que permite obtener el indice inicial de la secuencia que mas se repite de un arreglo de secuencias (de caracteres
letras minusculas separados por espacios) de tamanio MAXCOL (que empieza y termina con espacios).

Se pide realizar un programa completo que (sin utilizar arreglos o matrices auxiliares extras a las mencionadas, ni realizar declaraciones
explícitas de las matrices):
_contenga la definicion de el/los encabezado/s de el/los metodo/s mencionado/s como preexistente/s que figura/n en el enunciado (excepto
los de carga de datos en matrices, que solamente se invocan).
_en cada fila de A, si dicha fila tiene una unica secuencia y hay menos de 40 secuencias que la incluye en dicha fila de B, reemplace la
secuencia en A por la secuencia que mas se repite de dicha fila en B (la separacion previa entre secuencias debe mantenerse).
*/

//----------------------------------------------------------------------------------------------------------------------------------------

//importar librerías necesarias para los métodos preexistentes
//import java.util.Random; (si hubiera que cargar la matriz)
public class Parcial_de_practica2 {
	public static final int MAXFIL = 15; //les asigno valores aleatorios para poder declarar y desarrollar
	public static final int MAXCOL = 50;//les asigno valores aleatorios para poder declarar y desarrollar
	//si hubiera que cargar la matriz acá irían las constantes para cargarlas, y como son secuencias también habría que agregar la de probabilidad
	public static void main (String[]args){
		char[][]matrizA = new char [MAXFIL][MAXCOL];
		char[][]matrizB = new char [MAXFIL][MAXCOL];
		cargar_la_matriz_secuencias_char(matrizA);
		cargar_la_matriz_secuencias_char(matrizB);
		//para cada fila de A
		for (int fila=0; fila<MAXFIL;fila++){
			reemplazar_en_A_con_B(matrizA, matrizB, fila);
		}				
	}
	
	public static void reemplazar_en_A_con_B(char[][]matrizA, char[][]matrizB, int fila){
		int inicioSecuenciaRepetidaB;
		int cuantasVecesEstaLaSecuenciaAenB = retornar_en_cuantas_secuencias_se_encuentra (matrizA[fila], matrizB[fila]);
		int columna = 0, contadorDeSecuencias = 0, inicioSecuenciaA = 0, finSecuenciaB = 0;
		//para cada columna
		while(columna<MAXCOL){
			//si estoy en un inicio de secuencia guardo la posicion y le hago +1 al contador de secuencias
			if (matrizA[fila][columna] == ' '){
				if (matrizA[fila][columna+1] != ' '){
					inicioSecuenciaA = columna+1;
					contadorDeSecuencias++;
				}
			}
			//si dicha fila en A tiene una única secuencia
			columna++;
		}
		if (contadorDeSecuencias < 2){
			//si hay menos de 40 secuencias en B que la incluyen
			if(cuantasVecesEstaLaSecuenciaAenB < 40){
				//encontrar la secuencia mas repetida en esa fila en B
				inicioSecuenciaRepetidaB = retornar_inicio_secuencia_mas_repetida(matrizB[fila]);
				finSecuenciaB = retornar_fin_secuencia(matrizB, fila, inicioSecuenciaRepetidaB);	
				//insertarla en A (la secuencia en B va a ser igual o más grande así que no hace falta calcular el tamaño ni correr)
				insertar_B_en_A(matrizA, matrizB, inicioSecuenciaA, inicioSecuenciaRepetidaB, finSecuenciaB, fila);
			}
		}
	}
	
	public static void insertar_B_en_A(char[][[matrizA, char[][]matrizB, int inicioSecuenciaA, int inicioSecuenciaRepetidaB, int finSecuenciaB, int fila){
		while(inicioSecuenciaRepetidaB<finSecuenciaB){
			matrizA[fila][inicioSecuenciaA] = matrizB[fila][inicioSecuenciaRepetidaB];
		}
	}
	
	public static int retornar_fin_secuencia(char[][]matriz, int fila, int inicioSecuencia){
		int columna = inicioSecuencia;
		int finSecuencia = MAXCOL;
		while(columna<MAXCOL){
			if((matriz[fila][columna] != ' ') && (matriz[fila][columna+1] == ' ')){
				finSecuencia = columna;
			}
			columna++;
		}
		return finSecuencia;
	}
	
	public static int retornar_en_cuantas_secuencias_se_encuentra (char[]arregloSecuenciaAEncontrar, char []arregloDondeBuscar, int inicioSecuenciaAEncontrar){
		//...
		
	}
	
	public static int retornar_inicio_secuencia_mas_repetida(char[]arreglo){
		//...
	}
	
	//declaración del método de carga si hubiera que hacerlo public static void cargar_la_matriz_secuencias_char(char[][]matriz){...}
}
