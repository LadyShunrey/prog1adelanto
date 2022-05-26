//PARA ALEATORIO O RANDOM INCORPORAR LA LIBRERIA QUE SIGUE

import java.util.Random;
public class Clase7_ejemplo2 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		char [] arrchar;
		int [] arrint;
		double [] arrdouble;
		arrchar = new char[MAX];
		arrint = new int[MAX];
		arrdouble = new double[MAX];
		cargar_arreglo_aleatorio_char(arrchar);
		cargar_arreglo_aleatorio_int(arrint);
		cargar_arreglo_aleatorio_double(arrdouble);
		imprimir_arreglo_char(arrchar);
		imprimir_arreglo_int(arrint);
		imprimir_arreglo_double(arrdouble);
	}
	//carga de arreglo de char con valores de 'a' a la 'z'
	public static void cargar_arreglo_aleatorio_char(char [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(char)(r.nextInt(26) + 'a');
		}
	}
	//carga de arreglo de int con valores de MINVALOR a MAXVALOR
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	
	//carga de arreglo de double con valores de MINVALOR a MAXVALOR
	public static void cargar_arreglo_aleatorio_double(double [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=((MAXVALOR-MINVALOR+1)*r.nextDouble() + MINVALOR*1.0);
		}
	}
	//impresion de arreglo de char
	public static void imprimir_arreglo_char(char [] arr){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
	//impresion de arreglo de int
	public static void imprimir_arreglo_int(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
	//impresion de arreglo de double
	public static void imprimir_arreglo_double(double [] arr){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
}