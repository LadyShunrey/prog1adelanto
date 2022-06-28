/*16. Hay dos matrices MAT1 y MAT2 de secuencias de caracteres letras separados
por espacios de tamaño MAXF x MAXC que están precargadas. Ambas
matrices están precargadas y cada fila empieza y termina con caracteres
espacios. Además se tiene el siguiente método:
– un método que retorna el índice inicial de la secuencia de mayor tamaño de un
arreglo de secuencias (de caracteres letras minúsculas separados por espacios) de
tamaño MAXFIL.
Se pide realizar un programa que
– contenga la definición de los encabezados de los métodos de carga de la matriz y
del método mencionado en el enunciado (se supone que existen y no se requiere
implementarlos). -((LO HICE))-
– para MAT1 y MAT2 elimine de cada secuencia el primer carácter vocal. -((LO HICE))-
– para MAT1 agregue al principio de cada secuencia el primer carácter de la 
secuencia de mayor tamaño de dicha fila. -((LO HICE))-
– en cada fila, si se verifica que la secuencia de mayor tamaño de la fila para MAT1 es
mayor que la primer secuencia en dicha fila para MAT2, las intercambie (la que está
en MAT1 pasa a MAT2 y la que esta en MAT2 pasa a MAT1) sin usar estructuras
auxiliares (otros arreglos o matrices). -((puedo usar una variable aux no? - Bueno creo que la terminé jaja))-
– para un valor de fila ingresado por el usuario verifique e imprima si la primera
secuencia de MAT1 en dicha fila es igual la primera secuencia de MAT2 en dicha fila.*/

/*SOBRE LA MATRIZ DE CARACTERES:
Se tiene una matriz de caracteres de tamaño 4*20 de secuencias de
caracteres letras minúsculas entre ‘a’ y ‘z’ (por cada fila), separadas por ‘ ’
(espacios). La matriz esta precargada, y además cada fila empieza y termina
con uno o más separadores ‘ ’.*/

//importar todas las librerías
import java.util.Random;
public class Practico8_ejercicio16 {
	//declarar las constantes
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	//public static final int MAXFIL = 999;
	public static final double PROBABILIDAD_LETRA =0.4;
	public static void main (String[]args){
		//int mayorSecuenciaSize;
		//int primerSecuenciaSize;
		//int inicioSecuenciaMayor;
		//int inicioPrimerSecuencia;
		//int filaIngresada;
		//int inicioPrimerSecuencia1;
		//int inicioPrimerSecuencia2;
		//int sizePrimerSecuencia1;
		//int sizePrimerSecuencia2;
		//char[]arreglo = new char[MAXFIL];
		char [][]matriz1 = new char [MAXFILA][MAXCOLUMNA];
		char [][]matriz2 = new char [MAXFILA][MAXCOLUMNA];
		//Buffer entrada
		cargar_matriz_secuencias_char(matriz1);
		cargar_matriz_secuencias_char(matriz2);
		//cargar_arreglo(arreglo);
		System.out.println("La primer matriz: ");
		imprimir_la_matriz(matriz1);
		System.out.println("La segunda matriz: ");
		imprimir_la_matriz(matriz2);
		//elimine_primer_vocal_cada_secuencia(matriz1);
		//elimine_primer_vocal_cada_secuencia(matriz2);
		//for(int fila = 0; fila<MAXFILA; fila++){
			//agregar_en_cada_secuencia_primer_caracter_mayor_secuencia(matriz1, fila); -((podría modularizar y que primero retorne el valor y después lo inserte, tengo que decidir))-
		//}
		//for(int fila = 0; fila<MAXFILA; fila++){
			//mayorSecuenciaSize = retornar_tamano_mayor_secuencia(matriz1, fila); //secuencia de mayor tamaño de la fila para MAT1
			//primerSecuenciaSize = retornar_tamano_primer_secuencia(matriz2, fila); //primer secuencia en dicha fila para MAT2
			//if(mayorSecuenciaSize>primerSecuenciaSize){
				//inicioSecuenciaMayor = retornar_inicio_secuencia_mayor(matriz1);
				//inicioPrimerSecuencia = retornar_inicio_primer_secuencia(matriz2);
				//intercambiar_secuencias(matriz1, inicioSecuenciaMayor, mayorSecuenciaSize, matriz2, inicioPrimerSecuencia, primerSecuenciaSize, fila);
			//}
		//}
		//try
			//pedir fila al usuario
			//filaIngresada = levantar el input;
			//inicioPrimerSecuencia1 = retornar_inicio_primer_secuencia(matriz1);
			//inicioPrimerSecuencia2 = retornar_inicio_primer_secuencia(matriz2);
			//sizePrimerSecuencia1 = retornar_tamano_primer_secuencia(matriz1, fila);
			//sizePrimerSecuencia2 = retornar_tamano_primer_secuencia(matriz2, fila);
			//if(sizePrimerSecuencia1 == sizePrimerSecuencia2){
				//comparar_secuencias(matriz1, inicioPrimerSecuencia1, matriz2, inicioPrimerSecuencia2, filaIngresada, sizePrimerSecuencia1)
			//}
			//else{
				//imprimir que las secuencias no son iguales
			//}
		//catch
	}
	
	//public static void elimine_primer_vocal_cada_secuencia(char[][]matriz){
		//booleano yaBorreUna = false;
		//while (fila<MAXFILA){
			//while(columna<MAXCOLUMNA){
				//if (matriz[fila][columna]!=' '){
					//if (matriz[fila][columna-1]==' '){
						//yaBorreUna = false;
					//}
					//if(yaBorreUna == false)
						//switch vocal -no sé si se puede expresar así, sino guardaría el valor de esa posicion de la matriz  en una variable y compararía esa variable- --> switch(matriz[fila][columna]){
							//case 'a': case 'e': case 'i': case 'o': case 'u': {
								//borrar_vocal(correr a izquierda desde columna a columna)
								//yaBorreUna = true;
								//break;
							//}
						//}
				//}
			//columna++
			//}
		//fila++;
		//}
	//}
	
	//public static void agregar_en_cada_secuencia_primer_caracter_mayor_secuencia(char[][]matriz1, int fila){
		//agregue al principio de cada secuencia el primer carácter de la secuencia de mayor tamaño de dicha fila.
		//int columna = 0;
		//int secuenciaMayor = 0;
		//int suma= 0;
		//char primerCaracter= ' ';
		//char primerCaracterMayor= ' ';
		//encontrar la secuencia de mayor tamaño y guarde valor de la primera pos de esa secuencia
		//while(columna<MAXCOLUMNA){
			//if (matriz1[fila][columna]!= ' '){
				//suma += 1;
				//if (matriz1[fila][columna-1]== ' '){
					//primerCarater = matriz1[fila][columna];
				//}
				//if (matriz1[fila][columna+1]== ' '){
					//if(suma>secuenciaMayor){
						//secuenciaMayor = suma;
						//primerCaracterMayor = primerCaracter;
					//}
					//suma = 0;
					//primerCaracter = ' '
				//}
			//}
			//columna++
		//}
		//agregar ese valor al principio de cada secuencia de esa fila
		//while (columna<MAXCOLUMNA){
			//if(matriz1[fila][columna]!= ' '){
				//if (matriz1[fila][columna-1]== ' '){
					//matriz1[fila][columna] = primerCaracterMayor;
				//}
			//}
			//columna++;
		//}
	//}
	
	//public static int retornar_tamano_mayor_secuencia(char[][]matriz, int fila){
		//int contador = 0;
		//int mayorSecuencia = 0;
		//while (columna<MAXCOLUMNA){
			//if (matriz[fila][columna]!=' '){
				//contador++;
				//if (matriz[fila][columna+1]==' '){
					//if (contador>mayorSecuencia){
						//mayorSecuencia = contador;
					//}
					//contador =0;
				//}
			//}
			//columna++;
		//}
		//return mayorSecuencia;
	//}
	
	//public static int retornar_tamano_primer_secuencia(char[][]matriz, int fila){
		//int columna =0;
		//int contador =0;
		//boolean terminar = false;
		//while ((terminar == false)) && (columna<MAXCOLUMNA){
			//if(matriz[fila][columna]!=' '){
				//contador++;
				//if (matriz[fila][columna+1]==' '){
					//terminar = true;
				//}
			//}
			//columna++;
		//}
		//return contador;
	//}
	
	//public static int retornar_inicio_secuencia_mayor(char[][]matriz){
		//int columna = 0;
		//int contador = 0;
		//int mayorSecuencia = 0;
		//int posicion=0;
		//int mayorPosicion=0;
		//while (columna<MAXCOLUMNA){
			//if (matriz[fila][columna]!=' '){
				//contador++;
				//if(matriz[fila][columna-1]==' '){
					//posicion = columna;
				//}
				//if (matriz[fila][columna+1]==' '){
					//if (contador>mayorSecuencia){
						//mayorSecuencia = contador;
						//mayorPosicion = posicion;
					//}
					//contador =0;
					//posicion = 0;
				//}
			//}
			//columna++;
		//}
		//return mayorPosicion;
	//}
	
	//public static int retornar_inicio_primer_secuencia(matriz2){
		//int columna =0;
		//int posicionInicial;
		//boolean terminar = false;
		//while ((terminar == false)) && (columna<MAXCOLUMNA){
			//if(matriz[fila][columna]!=' '){
				//if (matriz[fila][columna-1] == ' '){
					//posicionInicial = columna;
				//}
				//if (matriz[fila][columna+1]==' '){
					//terminar = true;
				//}
			//}
			//columna++;
		//}
		//return posicionInicial;
	//}
	
	//public static void intercambiar_secuencias(char[][]matriz1, int inicioSecuenciaMayor, int mayorSecuenciaSize, char[][]matriz2, int inicioPrimerSecuencia, int primerSecuenciaSize, int fila){
		//la que está en MAT1 pasa a MAT2 y la que esta en MAT2 pasa a MAT1
		//como 1 es mayor que 2, para insertar en la 1 voy a tener que correr a izquierda para achicar, y para insertar en la 2 voy a tener que correr a derecha para agrandar
		//voy a tener que calcular la diferencia de tamaño entre 1 y 2 para saber cuánto agrandar o achicar
		//int diferenciaDeSize = mayorSecuenciaSize - primerSecuenciaSize;
		//int cantidadDeCopias = 0;
		//int cantidadDeCorridas = 0;
		//int columnaDeLaPrimera = inicioSecuenciaMayor;
		//int columnaDeLaSegunda = inicioPrimerSecuencia;
		//primero las voy a intercambiar la cantidad de veces = al tamaño de la secuencia más chica y después voy a hacer los corrimientos.
		//while((columnaDeLaPrimera<MAXCOLUMNA)&&(cantidadDeCopias<primerSecuenciaSize)&&(columnaDeLaSegunda<MAXCOLUMNA)){
			//aux = matriz1[fila][columnaDeLaPrimera];
			//matriz1[fila][columnaDeLaPrimera] = matriz2[fila][columnaDeLaSegunda];
			//columaDeLaSegunda++;
			//columnaDeLaPrimera++;
			//cantidadDeCopias++;
		//}
		//ahora primero voy a insertar la más grande en la más chica desde las posiciones iniciales corridas
		//para eso primero tengo que correr a derecha la más chica cantidad de veces = diferencia de tamaño
		//columnaDeLaSegunda = inicioPrimerSecuencia + primerSecuenciaSize;
		//while(columnaDeLaSegunda>0)&&(cantidadDeCorridas<diferenciaDeSize){
			//correr_a_derecha(matriz2, fila, columnaDeLaSegunda);
			//cantidadDeCorridas++;
		//}
		//columnaDeLaPrimera = inicioSecuenciaMayor + primerSecuenciaSize;
		//columnaDeLaSegunda = inicioPrimerSecuencia + primerSecuenciaSize;
		//cantidadDeCopias = 0;
		//while((columnaDeLaPrimera<MAXCOLUMNA)&&(cantidadDeCopias<diferenciaDeSize)&&(columnaDeLaSegunda<MAXCOLUMNA)){
			//matriz2[fila][columnaDeLaSegunda] = matriz1[fila][columnaDeLaPrimera];
			//columnaDeLaPrimera++;
			//columnaDeLaSegunda++;
			//cantidadDeCopias++;
		//}
		//y ahora solo queda achicar la primera
		//columnaDeLaPrimera = inicioSecuenciaMayor + primerSecuenciaSize;
		//cantidadDeCorridas =0;
		//while (columnaDeLaPrimera<MAXCOLUMNA)&&(cantidadDeCorridas<diferenciaDeSize){
			//correr_a_izquierda(matriz1, fila, columnaDeLaPrimera)
			//cantidadDeCorridas++;
		//}
	//}
	
	//public static void correr_a_derecha(char[][]matriz2, int fila, int columnaDeLaSegunda){
		//for(int columna = MAXCOLUMNA-1, columna>columnaDeLaSegunda; columna--){
			//matriz2[fila][columna] = matriz2[fila][columna-1];
		//}
	//}
	
	//public static void correr_a_izquierda(char[][]matriz1, int fila, int columnaDeLaPrimera){
		//for(int columna = columnaDeLaPrimera; columnaDeLaPrimera<MAXCOLUMNA-1; columna++){
			//matriz1[fila][columna] = matriz1[fila][columna+1] 
		//}
	//}
	
	//comparar_secuencias(char[][]matriz1, int inicioPrimerSecuencia1, char[][]matriz2, int inicioPrimerSecuencia2, int filaIngresada, int sizePrimerSecuencia1){
		//int cantidadDeVueltas =0;
		//boolean sonIguales = false;
		//while(cantidadDeVueltas<sizePrimerSecuencia)&&(matriz1[filaIngresada][inicioPrimerSecuencia1] == matriz2[filaIngresada][inicioPrimerSecuencia2] ){
			//inicioPrimerSecuencia1++;
			//inicioPrimerSecuencia2++;
			//cantidadDeVueltas++;
			//if (cantidadDeVueltas == sizePrimerSecuencia){
				//sonIguales = true;
			//}
		//}
		//if (sonIguales == true){
			//imprimo que son iguales
		//}
		//else{
			//imprimo que son distintas
		//}
	//}
	
	//public static int obtener_inicio_secuencia_mayor(char[]arreglo){
		//...
	//}
	
	public static void cargar_matriz_secuencias_char(char[][]matriz){
		for (int fila = 0; fila < MAXFILA; fila++){
			cargar_arreglo_aleatorio_secuencias_char(matriz[fila]);
		}
		System.out.println("");
	}
	
	public static void cargar_arreglo_aleatorio_secuencias_char(char [] arr){
		Random r = new Random();
		arr[0] = ' ';
		arr[MAXCOLUMNA-1] = ' ';
		for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
			if (r.nextDouble()>PROBABILIDAD_LETRA){
				arr[pos]=(char)(r.nextInt(26) + 'a');
			}
			else{
				arr[pos]=' ';				
			}
		}
	}
	
	public static void imprimir_la_matriz(char[][]matriz){
		for (int fila =0; fila<MAXFILA; fila++){
			for(int columna = 0; columna<MAXCOLUMNA; columna++){
				System.out.print("[" + matriz[fila][columna] + "]");
			}
			System.out.println("");
		}
	}
	
	//public static void cargar_arreglo(char[]arreglo){
		//...
	//}
}
