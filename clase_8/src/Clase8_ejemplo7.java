/*ordenar por columna con selección de manera creciente*/
import java.util.Random;
public class Clase8_ejemplo7 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		//declaro matriz
		int [][] matriz = new int [MAXFILA][MAXCOLUMNA];
		//la cargo
		cargar_matriz_aleatorio_int(matriz);
		//la imprimo
		imprimir_matriz_int(matriz);
		//la ordeno por columna
		System.out.println("Vamos a ordenarla por columna creciente :");
		ordenar_por_columna(matriz);
		//la imprimo
		imprimir_matriz_int(matriz);
	}
	public static void ordenar_por_columna(int[][]matriz){
		for(int columna = 0; columna < MAXCOLUMNA; columna++){
			for (int filaIndice = 0; filaIndice<MAXFILA; filaIndice++){
				int elMenor = filaIndice;
				for(int filaActual = filaIndice+1; filaActual < MAXFILA; filaActual++){
					if(matriz[filaActual][columna] < matriz [elMenor][columna]){
						elMenor = filaActual;
					}
				}
				if(elMenor!=filaIndice){
					int aux = matriz[filaIndice][columna];
					matriz [filaIndice][columna] = matriz [elMenor][columna];
					matriz [elMenor][columna] = aux;
				}
			}
		}
	}
	public static void cargar_matriz_aleatorio_int(int [][] matriz){
		Random r = new Random();
		for (int fila = 0 ; fila <MAXFILA ; fila++){
			for (int columna = 0; columna < MAXCOLUMNA ; columna++){
				matriz [fila][columna] = (r.nextInt(MAXVALOR+MINVALOR-1)+MINVALOR);
			}
		}
	}
	public static void imprimir_matriz_int(int [][] matriz){
		for(int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for(int columna= 0;columna<MAXCOLUMNA;columna++){
				System.out.print(matriz[fila][columna] + "|");
			}
			System.out.println("");
		}
	}
	
	
	
	public static void ordenar_por_columnaa(int[][]matriz){
		for(int columna = 0; columna < MAXCOLUMNA; columna++){
			for (int filaIndice = 0; filaIndice<MAXFILA; filaIndice++){
				for(int filaActual = filaIndice+1; filaActual < MAXFILA; filaActual++){
					if(matriz[filaActual][columna] < matriz [filaActual][columna]){
						int aux = matriz[filaIndice][columna];
						matriz [filaIndice][columna] = matriz [filaActual][columna];
						matriz [filaActual][columna] = aux;
					}
				}
				
			}
		}
	}
}
