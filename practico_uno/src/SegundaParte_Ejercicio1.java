// Lo que hay que hacer: 

//	1. Escribir un programa que solicite y luego muestre por consola los valores
//necesarios para dibujar un círculo y un triángulo. Hay que determinar en cada
//caso que constantes (que no se cargan por consola) y variables con tipos son
//necesarias declarar.

//	2. Escribir un programa que solicite los siguientes datos de una persona (nombre,
//apellido, edad, altura, ocupación, dirección) y los imprima por pantalla.

//	3. Escribir un programa que pida que se ingresen datos necesarios para emitir una
//factura por la compra de dos artículos de librería (tipo factura, número, nombre
//cliente, producto 1, importe 1, producto 2, importe 2, importe total). Como
//salida debe imprimir por pantalla la factura en un formato similar al siguiente
//(utilizar literales):
	

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SegundaParte_Ejercicio1 {

	public static void main(String[] args) {
		
		double radio;
		final double numeroPi = 3.14159265358979323846;
		
		System.out.println("Vamos a dibujar un círculo!! Para eso necesitamos que nos proponga un valor para su radio");
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Por favor, ingrese un valor para el radio del círculo que quiera dibujar: ");
			radio = Double.valueOf(entrada.readLine());
			System.out.println("El radio ingresado es: " + radio);
			
			double perimetroCirculo = 2 * numeroPi * radio;
			System.out.println("Por lo tanto el perímetro de su círculo es = " + perimetroCirculo);
		}
		
		catch (Exception exc){
			System.out.println(exc);
		}
		
		System.out.println("Ahora vamos a dibujar un triángulo!! Para eso necesitamos que nos proponga un valor para cada uno de los lados del triángulo");
		
		double lado1;
		double lado2;
		double lado3;
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Por favor, ingrese un valor para el primer lado del triángulo: ");
			lado1 = Double.valueOf(entrada.readLine());
			System.out.println("El valor ingresado es: " + lado1 + ", que será el valor del primer lado");
			
			System.out.println("Por favor, ingrese un valor para el segundo lado del triángulo: ");
			lado2 = Double.valueOf(entrada.readLine());
			System.out.println("El valor ingresado es: " + lado2 + ", que será el valor del segundo lado");
			
			System.out.println("Por favor, ingrese un valor para el tercer y último lado del triángulo: ");
			lado3 = Double.valueOf(entrada.readLine());
			System.out.println("El valor ingresado es: " + lado3 + ", que será el valor del tercer lado");
			
			double perimetroTriangulo = lado1 + lado2 + lado3;
			System.out.println("Por lo tanto el perímetro de su triángulo es = " + perimetroTriangulo);
		}
		
		catch (Exception exc){
			System.out.println(exc);
		}
		
	}

}
