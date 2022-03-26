/*Construir un programa que solicite desde teclado un n�mero de
mes y posteriormente notifique por pantalla la cantidad de d�as
de ese mes. En el caso de que ingrese 2 como n�mero de mes
(febrero), para imprimir la cantidad de d�as deber� solicitar
ingresar un n�mero de anio (no usar �), para determinar si es
bisiesto o no con la siguiente sentencia:
_si ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) es verdadero,
entonces es bisiesto.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico3_SegundaParte_Ejercicio3 {

	public static void main(String[] args) {

		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			int mes;
			int anio;
			
			System.out.println("Por favor ingrese un mes");
			mes = Integer.valueOf(entrada.readLine());

			switch(mes){
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
					System.out.println("El mes tiene 31 d�as");
					break;
				}
				case 4: case 6: case 9: case 11:{
					System.out.println("El mes tiene 30 d�as");
					break;
				}
				case 2:{
					System.out.println("En Febrero la cantidad de d�as var�a seg�n el a�o, as� que por favor ingrese el a�o:");
					anio = Integer.valueOf(entrada.readLine());
					if (((anio % 4) == 0) && (((anio % 100) != 0) || ((anio % 400) == 0))){
						System.out.println("El a�o elegido es bisiesto y por lo tanto Febrero cuenta con 29 d�as");
					}
					else{
						System.out.println("Febrero en el a�o elegido no es bisiesto y por lo tanto tiene 28 d�as");
					}
					break;
				}
				default:{
					System.out.println("El n�mero ingresado no es v�lido como un mes, por favor elija un n�mero del 1 al 12");
				}
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}

}
