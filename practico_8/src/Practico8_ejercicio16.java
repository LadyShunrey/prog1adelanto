/*16. Hay dos matrices MAT1 y MAT2 de secuencias de caracteres letras separados
por espacios de tama�o MAXF x MAXC que est�n precargadas. Ambas
matrices est�n precargadas y cada fila empieza y termina con caracteres
espacios. Adem�s se tiene el siguiente m�todo:
� un m�todo que retorna el �ndice inicial de la secuencia de mayor tama�o de un
arreglo de secuencias (de caracteres letras min�sculas separados por espacios) de
tama�o MAXFIL.
Se pide realizar un programa que
� contenga la definici�n de los encabezados de los m�todos de carga de la matriz y
del m�todo mencionado en el enunciado (se supone que existen y no se requiere
implementarlos). -((LO HICE))-
� para MAT1 y MAT2 elimine de cada secuencia el primer car�cter vocal. -((LO HICE))-
� para MAT1 agregue al principio de cada secuencia el primer car�cter de la 
secuencia de mayor tama�o de dicha fila. -((LO HICE))-
� en cada fila, si se verifica que la secuencia de mayor tama�o de la fila para MAT1 es
mayor que la primer secuencia en dicha fila para MAT2, las intercambie (la que est�
en MAT1 pasa a MAT2 y la que esta en MAT2 pasa a MAT1) sin usar estructuras
auxiliares (otros arreglos o matrices). -((Estructura auxiliar es un arreglo o puede ser una variable?))-
� para un valor de fila ingresado por el usuario verifique e imprima si la primera
secuencia de MAT1 en dicha fila es igual la primera secuencia de MAT2 en dicha fila.*/

/*SOBRE LA MATRIZ DE CARACTERES:
Se tiene una matriz de caracteres de tama�o 4*20 de secuencias de
caracteres letras min�sculas entre �a� y �z� (por cada fila), separadas por � �
(espacios). La matriz esta precargada, y adem�s cada fila empieza y termina
con uno o m�s separadores � �.*/

import java.util.Random;
public class Practico8_ejercicio16 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 20;
	//public static final int MAXFIL = 999;
	public static final double PROBABILIDAD_LETRA =0.4;
	public static void main (String[]args){
		//char[]arreglo = new char[MAXFIL];
		char [][]matriz1 = new char [MAXFILA][MAXCOLUMNA];
		char [][]matriz2 = new char [MAXFILA][MAXCOLUMNA];
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
			//agregar_en_cada_secuencia_primer_caracter_mayor_secuencia(matriz1, fila); -((podr�a modularizar y que primero retorne el valor y despu�s lo inserte))-
		//}
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
						//switch vocal -no s� si se puede expresar as�, sino guardar�a el valor de esa posicion de la matriz  en una variable y comparar�a esa variable- --> switch(matriz[fila][columna]){
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
		//agregue al principio de cada secuencia el primer car�cter de la secuencia de mayor tama�o de dicha fila.
		//int columna = 0;
		//int secuenciaMayor = 0;
		//int suma= 0;
		//char primerCaracter= ' ';
		//char primerCaracterMayor= ' ';
		//encontrar la secuencia de mayor tama�o y guarde valor de la primera pos de esa secuencia
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
