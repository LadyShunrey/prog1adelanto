// Lo que hay que hacer: 

//	1. Escribir un programa que solicite y luego muestre por consola los valores
//necesarios para dibujar un c�rculo y un tri�ngulo. Hay que determinar en cada
//caso que constantes (que no se cargan por consola) y variables con tipos son
//necesarias declarar.

//	2. Escribir un programa que solicite los siguientes datos de una persona (nombre,
//apellido, edad, altura, ocupaci�n, direcci�n) y los imprima por pantalla.

//	3. Escribir un programa que pida que se ingresen datos necesarios para emitir una
//factura por la compra de dos art�culos de librer�a (tipo factura, n�mero, nombre
//cliente, producto 1, importe 1, producto 2, importe 2, importe total). Como
//salida debe imprimir por pantalla la factura en un formato similar al siguiente
//(utilizar literales):


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SegundaParte_Ejercicio2 {

	public static void main(String[] args) {
		// variable nombre, apellido, edad, altyra, ocupacion, direccion 
		// pedir nombre, apellido, edad, altura, ocupaci�n, direcci�n
		// imprimir todo eso en pantalla
		
		System.out.println("Bienvenido! Para poder comenzar vamos a pedirle algunos datos personales! ");
		
		try{
			
			String nombre;
			int edad;
			double altura;
			String direccion;
			String ocupacion;
			String apellido;
			
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Por favor, ingrese su nombre: ");
			nombre = entrada.readLine();
			System.out.println("El nombre ingresado es: " + nombre + "\nBienvenido/a " + nombre + ", es un gusto tenerte ac�!");	
			
			System.out.println("Muy bien " + nombre + " ahora necesitamos que ingrese su edad: ");
			edad = Integer.valueOf(entrada.readLine());
			System.out.println("Su edad es: " + edad + "\nQu� joven eres " + nombre + "!!!! En serio tienes " + edad + "??? Cu�ntanos cu�l es tu secreto para verte tan bien!");
			
			System.out.println("Genial " + nombre + " ahora, aparte de tu secreto de conservaci�n, necesitamos que ingrese su altura: ");
			altura = Double.valueOf(entrada.readLine());
			System.out.println("Su altura es: " + altura);

			System.out.println("Bueno ya nos falta poco para terminar " + nombre + ", por favor d�ganos su direcci�n postal: ");
			direccion = entrada.readLine();
			System.out.println("Su direcci�n ingresada es: " + direccion);
			
			System.out.println("Por �ltimo " + nombre + ", cu�ntenos cu�l es su ocupaci�n: ");
			ocupacion = entrada.readLine();
			System.out.println("Su ocupaci�n ingresada es: " + ocupacion);
			
			System.out.println("Un momento " + nombre + "!!!! Nos hemos olvidado de preguntarle por su apellido!! Por favor ind�quenoslo: ");
			apellido = entrada.readLine();
			System.out.println("Su apellido ingresado es: " + apellido);
			
			System.out.println("Genial!! Pasaremos entonces todos sus datos en limpio... \nSu nombre es: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nAltura: " + altura + "\nSu ocupaci�n: " + ocupacion + "\nDirecci�n: " + direccion);
			
			
		}
		
		catch (Exception exc){
			System.out.println(exc);
		}

	}

}
