/*Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días
de ese mes. En el caso de que ingrese 2 como número de mes
(febrero), para imprimir la cantidad de días deberá solicitar
ingresar un número de anio (no usar ñ), para determinar si es
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
					System.out.println("El mes tiene 31 días");
					break;
				}
				case 4: case 6: case 9: case 11:{
					System.out.println("El mes tiene 30 días");
					break;
				}
				case 2:{
					System.out.println("En Febrero la cantidad de días varía según el año, así que por favor ingrese el año:");
					anio = Integer.valueOf(entrada.readLine());
					if (((anio % 4) == 0) && (((anio % 100) != 0) || ((anio % 400) == 0))){
						System.out.println("El año elegido es bisiesto y por lo tanto Febrero cuenta con 29 días");
					}
					else{
						System.out.println("Febrero en el año elegido no es bisiesto y por lo tanto tiene 28 días");
					}
					break;
				}
				default:{
					System.out.println("El número ingresado no es válido como un mes, por favor elija un número del 1 al 12");
				}
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}

}
