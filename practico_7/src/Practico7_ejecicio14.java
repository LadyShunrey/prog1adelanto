/*Hacer un programa que dado el arreglo definido y precargado, y un número entero
ingresado por el usuario, copie de forma continua las secuencias de tamaño igual al
número ingresado en otro arreglo de iguales características e inicializado con 0. La
copia en este último arreglo deben comenzar desde el principio del mismo.*/

import java.util.Random;

public class Practico7_ejecicio14 {
	public static final int MAX = 40;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double PROBABILIDAD_NUMERO = 0.4;

	public static void main(String[] args) {
		int[] arreglo = new int[MAX];
		cargar_el_arreglo_aleatorio_de_secuencias(arreglo);
		imprimir_el_arreglo_aleatorio_de_secuencias(arreglo);
		// tengo un arreglo
		// entra numero entero del usuario
		// ir iterando las secuencias y comparar su tamaño con numero
		// buscar secuencia de tamaño igual al numero
		// hago nuevo arreglo
		int numeroDelUsuario = 2;
		crear_nuevo_arreglo_de_secuencias(arreglo, numeroDelUsuario);

	}

	public static void crear_nuevo_arreglo_de_secuencias(int[] arreglo,	int numero) {
		int contador = 0;
		int indice = 0;
		int[] arregloNuevo = new int[MAX];
		int posicionArregloNuevo = 0;
		for (int pos = 0; pos < MAX; pos++) {
			
			if (arreglo[pos] == 0) {
				
				if (contador == 0) {
					indice = pos;
				}
				else
				 if (contador == numero) {
					// indice retornar posicion de inicio de secuencia
					insertar_en_nuevo_arreglo(arreglo, indice, arregloNuevo, posicionArregloNuevo, numero);
					posicionArregloNuevo+=numero+1;
				
				}

				if (contador != 0) {
					contador = 0;
					indice = pos+1-1;
				}
			}
			if (arreglo[pos] != 0) {
				contador++;
			}

		}
	}

	public static void insertar_en_nuevo_arreglo(int[] arreglo, int indice, int [] arregloNuevo, int posicionArregloNuevo, int numero) {
		
		for (int pos = 0; pos <= numero; pos++) {
			arregloNuevo[posicionArregloNuevo+pos] = arreglo[indice+pos];
			
		}

		System.out.println("El arreglo es: ");
		for (int laPosicion = 0; laPosicion < MAX; laPosicion++) {
			System.out.print(arregloNuevo[laPosicion] + "|");
		}
		System.out.print("\n");
	}

	// encuentro secuencia
	// nuevo arreglo desde ESTA posicion

	public static void cargar_el_arreglo_aleatorio_de_secuencias(
			int[] arregloDeSecuencias) {
		Random r = new Random();
		arregloDeSecuencias[0] = 0;
		arregloDeSecuencias[MAX - 1] = 0;

		for (int laPosicion = 1; laPosicion < MAX - 1; laPosicion++) {
			if (r.nextDouble() > PROBABILIDAD_NUMERO) {
				arregloDeSecuencias[laPosicion] = (r.nextInt(MAXVALOR
						- MINVALOR + 1) + MINVALOR);
			}

			else {
				arregloDeSecuencias[laPosicion] = 0;

			}
		}
	}

	public static void imprimir_el_arreglo_aleatorio_de_secuencias(
			int[] arregloDeSecuencias) {
		System.out.print("El arreglo de secuencias aleatorio int es\n|");
		for (int laPosicion = 0; laPosicion < MAX; laPosicion++) {
			System.out.print(arregloDeSecuencias[laPosicion] + "|");
		}
		System.out.print("\n");
	}
}
