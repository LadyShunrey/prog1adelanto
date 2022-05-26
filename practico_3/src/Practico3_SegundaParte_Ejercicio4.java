/*El astr�nomo Met�n de Atenas descubri� hacia el siglo V a.C que la luna
repite su ciclo cada 19 a�os (el mismo d�a del mismo mes tendr� la misma
fase lunar). Sus aportes permitieron determinar la fase de la luna para una
fecha dada. Los pasos para obtener esa informaci�n son:

a. Calcular el n�mero �ureo: permite conocer en qu� a�o-tipo del ciclo
nos encontramos considerando la repetici�n de ciclos cada 19 a�os.
El n�mero �ureo se calcula de la siguiente forma:
� Tomamos la cifra del a�o que nos interesa (por ejemplo 2023) y le sumamos 1
(2023+1=2024)
� A continuaci�n dividimos el resultado por 19 (ciclo de repetici�n) y nos
quedamos con el resto 2024/19 = 106 resto = 10 (10 es el resto entre 2024 y 19). Al
dividir por 19 hemos eliminado los ciclos repetidos. As� el n�mero �ureo es 10.

b. Calcular la epacta: es la edad de la luna en d�as el 1 de enero del
a�o elegido, y se calcula de la siguiente forma:
� Se resta 1 del n�mero �ureo, y se multiplica por 11 (en nuestro caso 10-1 = 9; 9*11
= 99)
� Despu�s, se divide por 30 (un mes lunar) y de nuevo nos quedamos con el resto:
99/30 = 3 resto = 9. Significa que el 1 de enero de 2023 habr�n pasado 9 d�as
desde la �ltima luna nueva.

c. Finalmente, para saber la edad lunar en un d�a cualquiera,
(supongamos el 15 de junio de 2023) realizaremos la siguiente
operaci�n:

1) A la epacta (9) le sumamos 1 por cada mes a partir de marzo (por
ejemplo: de marzo a junio sumamos 4, y si el mes fuera enero de
marzo a enero sumamos 11), y luego le sumamos el d�a del mes
requerido (15), es decir 9+4+15=28.

2) 28 es la edad lunar para esa fecha, y si pasara de 29 habr�a que
reducirlo obteniendo el resto de dividir por 30.

3) Es decir que el 15 de junio de 2023 habr�n pasado 28 d�as desde la
�ltima luna nueva, por lo que la luna ser� menguante casi nueva (a
falta de un d�a aproximadamente).

Se pide: hacer un programa completo en el cual se solicite de teclado el
ingreso de un d�a, un n�mero de mes, y un a�o; luego calcule la cantidad
de d�as desde la �ltima luna nueva (edad lunar), e informe por pantalla en
cual de las 4 fases se corresponde para esa fecha.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico3_SegundaParte_Ejercicio4 {

	public static void main(String[] args) {
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			int anio;
			int mes;
			int dia;
			
			System.out.println("Por favor ingrese un a�o:");
			anio = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ahora por favor ingrese un mes de ese a�o");
			mes = Integer.valueOf(entrada.readLine());
			
			System.out.println("Por �ltimo ingrese un d�a de ese mes");
			dia = Integer.valueOf(entrada.readLine());
		
			System.out.println("La fecha elegida es: " + dia + " del mes " + mes + " del a�o " + anio);
			
			int numeroAureo; /*calculamos el numero aureo*/
			numeroAureo = (anio + 1) % 19;
			
			System.out.println("El n�mero aureo es = " + numeroAureo);
						
			int epacta; /*calculamos la epacta*/
			epacta = ((numeroAureo - 1) * 11) % 30;
			
			System.out.println("Le epacta es = " + epacta + ". Y esto significa que el 1 de Enero del a�o " + anio + " han pasado " + epacta + " d�as desde la �ltima luna nueva");
			
			switch (mes){
				case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:{
					mes = mes - 2;
					System.out.println("El nuevo n�mero de mes es = " + mes);
					break;
				}
				
				case 1: case 2:{
					mes = mes + 10;
					System.out.println("El nuevo n�mero de mes es = " + mes);
					break;
				}
				
				default:{
					System.out.println("El mes ingresado no es v�lido, por favor elija un n�emro del 1 al 12");
				}
			}
			
			int edadLunar; /*calculamos la edad lunar un dia cualquiera*/
			edadLunar = epacta + mes + dia;
			System.out.println("La edad Lunar es = " + edadLunar + " es decir que han pasado esa cantidad de d�as desde la �ltima luna nueva.");

			if (edadLunar>29.53){
				edadLunar = edadLunar % 30;
				System.out.println("C�mo la edad lunar es mayor a 29,53 hay que dividirla por 30, entonces la verdadera edad lunar es = " + edadLunar + ". Eso significa que han pasado esa cantidad de d�as desde la �ltima luna nueva.");
			}
			
			if ((edadLunar>=1) && (edadLunar<=7)){
				System.out.println("La luna est� en su fase 1: Luna nueva. ");
			}
			else if ((edadLunar>=8) && (edadLunar<=14)){
				System.out.println("La luna est� en su fase 2: Luna creciente (cambia el aspecto segun hemisferio norte o sur)");
			}
			else if ((edadLunar>=15) && (edadLunar<=21)){
				System.out.println("La luna est� en su fase 3: Luna llena.");
			}
			else if ((edadLunar>=22) && (edadLunar<=29.53)){
				System.out.println("La luna est� en su fase 4:  Luna menguante (cambia el aspecto segun hemisferio norte o sur)");
			}
			
			 
		}
		
		catch(Exception exc){
			System.out.println(exc);
		}
		
		
	}

}
