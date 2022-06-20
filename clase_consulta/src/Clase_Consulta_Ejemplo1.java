import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Clase_Consulta_Ejemplo1 {
	public static final int MAX = 10;
	public static final int MIN = 0;
	public static void main(String[] args) {
		int numeroIngresado;
		int [] arregloDeEnteros = new int [MAX];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Por favor ingrese un entero: ");
			numeroIngresado = Integer.valueOf(entrada.readLine());
			cargar_el_arreglo(arregloDeEnteros);
			imprimir_el_arreglo(arregloDeEnteros);
			corremelo_a_la_derecha(arregloDeEnteros, numeroIngresado);
		}
		catch (Exception exc){
			System.out.println(exc);
		}			
	}	
	public static void cargar_el_arreglo(int[]arregloDeEnteros){
		Random carga = new Random();
		for (int laPosicion = 0; laPosicion<MAX; laPosicion++){
			arregloDeEnteros [laPosicion] = (carga.nextInt(MAX-MIN+1)+MIN);
		}
	}	
	public static void imprimir_el_arreglo(int [] arregloDeEnteros){	
		for(int laPosicion = MIN;laPosicion<MAX;laPosicion++){
			System.out.println("Para la posició "+laPosicion+" el valor adentro es = " + arregloDeEnteros[laPosicion]);
		}
	}
	public static void corremelo_a_la_derecha(int[]arrelgoDeEnteros, int numeroIngresado){
		int indice = MAX-1;
		for (int laPosicion = MIN; laPosicion<MAX; laPosicion++){
			arregloDeEnteros[laPosicion] =
		}
	}
}
