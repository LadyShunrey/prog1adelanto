/*Suponer que se tienen dos arreglos A y B de secuencias (de caracteres separados por uno o
m�s espacio) de tama�o MAX (arreglo empieza y termina con uno o m�s caracteres
espacio). A y B que est�n precargadas, y adem�s se tienen los siguientes m�todos (existen y
no se tienen que implementar):
a) un m�todo que permite obtener el �ndice inicial de la secuencia que m�s se repite de un
arreglo de secuencias de tama�o MAX (que empieza y termina con o m�s caracteres
espacios).

b) un m�todo que retorna el �ndice inicial de la secuencia que tiene m�s caracteres
repetidos de un arreglo de secuencias (de caracteres separados por uno o m�s caracteres
espacio) de tama�o MAX (que empieza y termina con espacio).
Se pide realizar un programa completo que (sin utilizar arreglos auxiliares/extras a los
mencionados):

_reemplace en A la secuencia que m�s se repite por la secuencia de B con m�s
caracteres repetidos (la separaci�n previa entre las secuencias de A debe mantenerse).
En caso de utilizar uno o m�s de los m�todos preexistentes mencionados en el enunciado
definir el o los encabezados de los mismos. No se requiere hacer m�todos de carga e
impresi�n de arreglos.*/

public class Practico7_ejecicio17 {
	public static final int MAX = 10;
	public static final int MIN = 0;
	//importar librer�as para los m�todos preexistentes y los arreglos precargados
	public static void main(String[] args) {
		int indiceInicialA;
		int indiceInicialB;
		int longitudA;
		int longitudB;
		char [] arregloA = {' ','a','a',' ','b','c','d',' ',' ',' '}; //new char [MAX];
		char [] arregloB = {' ','b','b','b','b','b',' ','b',' ',' '}; //new char [MAX];
		//cargar_el_arreglo_de_secuencia_aleatorio_A(arregloA);
		//cargar_el_arreglo_de_secuencia_aleatorio_B(arregloB);
		//buscar en A la secuencia que m� se repite
		//buscar en B la secuencia con m�s caracteres repetidos
		//qu� tama�o tiene A
		//qu� tama�o tiene B
		//meter B en A
		//pido la posicion donde empiezan A y B
		indiceInicialA = retornar_indice_inicial_secuencia_mas_repetida(arregloA);
		indiceInicialB = retornar_indice_inicial_secuencia_mas_caracteres_repetidos(arregloB);
		//calculo el tama�o que tienen A y B
		longitudA = retornar_longitud_de_secuencia(arregloA, indiceInicialA);
		longitudB = retornar_longitud_de_secuencia(arregloB, indiceInicialB);
		imprimir_el_arreglo_aleatorio_de_secuencias(arregloA);
		imprimir_el_arreglo_aleatorio_de_secuencias(arregloB);
		if (longitudA>longitudB){
			correr_a_izquierda(arregloA, indiceInicialA, longitudA-longitudB);
			System.out.println("Corriden a izq");
			imprimir_el_arreglo_aleatorio_de_secuencias(arregloA);
			longitudA=longitudB;
		}
		
		else if (longitudB>longitudA){
			correr_a_derecha(arregloA, indiceInicialA, longitudB-longitudA);
			System.out.println("Corriden a der");
			imprimir_el_arreglo_aleatorio_de_secuencias(arregloA);
			longitudA=longitudB;
		}
		
		reemplazar_en_A_con_B(arregloA, arregloB, indiceInicialA, indiceInicialB, longitudA);
		System.out.println("Arreglo reeemplzado");
		imprimir_el_arreglo_aleatorio_de_secuencias(arregloA);
		
	}
	
	public static void reemplazar_en_A_con_B(char [] arregloA, char [] arregloB, int indiceInicialA, int indiceInicialB, int longitudA){
		int corte = indiceInicialA + longitudA;
		//me paro en A pos init
		for (int posicion = indiceInicialA; posicion < corte; posicion++)
			//traigo el valor de b pos init
			arregloA [posicion] = arregloB[indiceInicialB - indiceInicialA + posicion];
		//paso a la que sigue
		//corto cuando haya hecho longitud iteraciones
	}
	
	public static void correr_a_izquierda(char [] arreglo, int initA, int diferencia){
		// me paro en el inicio de la secuancia y la voy comiendo
		for (int vuelta = 0; vuelta <= diferencia; vuelta++){
			for (int pos = initA; pos<MAX-1; pos++){
				arreglo[pos]= arreglo[pos+1];
			}
		}
	}
	
	public static void correr_a_derecha(char [] arregloA, int indiceInicialA, int diferencia){
		//me paro al final de la secuencia y la como
		for (int vuelta = 0; vuelta < diferencia; vuelta++){
			for (int pos = MAX-1; pos > indiceInicialA; pos--){
				arregloA[pos] = arregloA[pos-1]; //�am�am
	
			}
		}
	}
	
	public static int retornar_longitud_de_secuencia(char [] elArreglo, int posicion){
		int longitud = 0; //vamos a ir contando la longitud de la secuencia
		while (posicion < MAX && elArreglo[posicion] != ' '){
			//arrancamos del inicio de la secuencia
			//sumamos cada caracter que no sea un espacio
			//si hay un espacio salimos
				longitud ++;
			posicion++;
		}
		return longitud;
	}
	
	public static int retornar_indice_inicial_secuencia_mas_repetida(char [] arreglo){
		//		...para arreglo a, devolver 1
		return 1;
	}
	
	public static int retornar_indice_inicial_secuencia_mas_caracteres_repetidos(char [] arreglo){
		//		...para arreglo b, devolver 1
		return 1;
	}
	
	
	public static void cargar_el_arreglo_de_secuencia_aleatorio_A(char [] arr){
		arr = new char[]{' ','a','a',' ','b','c','d',' ',' '};
	}
	
	public static void cargar_el_arreglo_de_secuencia_aleatorio_B(char [] arr){
		arr = new char[]{' ','b','b','b','b','b',' ','b',' '};
	}
	public static void imprimir_el_arreglo_aleatorio_de_secuencias(char[]arregloDeSecuencias){
		System.out.print("El arreglo de secuencias aleatorio int es\n|");
		for (int laPosicion = 0; laPosicion < MAX; laPosicion++){
			System.out.print(arregloDeSecuencias[laPosicion]+"|");
		}
		System.out.print("\n");	
	}
}
