/*Hacer un programa que dado un arreglo de enteros de tamano 10 que se encuentra precargado, encuentre la posicion de un numero entero
ingresado por el usuario. Si existe, muestre esa posicion por pantalla, o indique que no existe.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Clase7_ejemplo4 {
	public static final int MAX = 10;	
	public static final int MIN = 0;	
	public static void main(String[] args) {
		int numeroIngresado;	//variable del numero ingresado
		int laPosicion;
		int [] arrenteros = new int[MAX];	//declarar el arreglo y ponerle un tama�o
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		cargar_arreglo(arrenteros);	//llamamos cargar arreglo
		mostrar_el_arreglo(arrenteros);	//mostrar ese arrglo	
		try{
			System.out.println("Ingrse un numero para ver si est� en el arreglo");
			numeroIngresado = Integer.valueOf(entrada.readLine()); 	//pedir un numero al usuario
			laPosicion = buscar_posicion(arrenteros, numeroIngresado);
			if (laPosicion<MAX){
				System.out.println("El n�mero ingresado est� en el arreglo en la posici�n: " + laPosicion);
			}
			else{
				System.out.println("no se encuentra en el arreglo el n�mero ingresado: " +numeroIngresado);
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}	
	}
	//metodo cargar arrreglo
	public static void cargar_arreglo(int [] arrenteros){
		Random r = new Random();
		for (int posicion = 0; posicion < MAX; posicion++){
			arrenteros[posicion]=(r.nextInt(MAX-MIN+1) + MIN);
		}
	}
	//metodo imprimir arreglo
	public static void mostrar_el_arreglo(int [] arrenteros){
		for (int posicion = 0; posicion < MAX; posicion++){
				System.out.println("nombre_arreglo[" + posicion + "]=>: " + arrenteros[posicion]);
			}
	}
	public static int buscar_posicion(int [] arrenteros, int numeroIngresado){
		int laPosicion = 0;
		while ((laPosicion<MAX) && (arrenteros[laPosicion]!=numeroIngresado)){	
			System.out.println("Vamos buscando si est� por la posici�n " + laPosicion);
			laPosicion++;
			System.out.println("Ahora se increment� y vamos por la posici�n " + laPosicion);
		}
		return laPosicion;
	}
}
