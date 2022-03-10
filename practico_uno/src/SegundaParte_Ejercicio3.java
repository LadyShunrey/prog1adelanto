//Escribir un programa que pida que se ingresen datos necesarios para emitir una
//factura por la compra de dos artículos de librería (tipo factura, número, nombre
//cliente, producto 1, importe 1, producto 2, importe 2, importe total). Como
//salida debe imprimir por pantalla la factura en un formato similar al siguiente
//(utilizar literales):

import java.io.BufferedReader;
import java.io.InputStreamReader;
					
public class SegundaParte_Ejercicio3 {

	//variable anterior factura inicializada en x
	public static void main(String[] args) {
		//declarar:
		//variable tipo de factura
		//variable número de factura con valor inicial de la anterior factura
		//variable nombre de cliente
		//variable producto 1
		//variable importe 1
		//variable subtotal = importe1
		//variable producto 2
		//variable importe 2
		//varible importe total= subtotal + importe2
		//sistema pide al vendedor ingresar tipo de factura A B C
		//sistema emite solo el numero de factura= anterior +1
		//vendedor ingresa nombre de cliente
		//vendedor ingresa producto1
		// sistema devuelve el precio del producto
		//sistema devueve el total
		//vendedor ingresa el producto 2
		//sistema devuelve el importe 2
		//sistema devuelve el total
		//sistema imprime factura
		
		int anteriorFactura;
		anteriorFactura = 321;
	
		//double subtotal;
		
		System.out.println("La anterior factura es la número: " + anteriorFactura);
		
		System.out.println("Bienvenido! Qué bueno que haya vendido algo! Vamos a imprimirle la factura de la venta!");
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			String tipoDeFactura;
			System.out.println("Necesitamos que ingrese si el tipo de factura que desea imprimir es A, B ó C: ");
			tipoDeFactura = entrada.readLine();
			System.out.println("El tipo de factura elegido es: " + tipoDeFactura);
			
			int numeroDeFactura;
			numeroDeFactura = anteriorFactura + 1;
			System.out.println("el nuevo número de factura es: " + numeroDeFactura);

			anteriorFactura = numeroDeFactura;
			System.out.println("entonces actualizamos la variable anteriorFactura para que tome el valor de la nueva factura para que se actualice en cada factura, queda entonces: " + numeroDeFactura + " la actual, y la anterior ahora también es " + anteriorFactura);
			
			String nombreDeCliente;
			System.out.println("Por favor, ingrese el nombre y apellido del cliente: ");
			nombreDeCliente = entrada.readLine();
			System.out.println("El nombre ingresado es: " + nombreDeCliente);
			
			String producto1;
			System.out.println("Por favor, ingrese el producto a facturar y le mostraremos automáticamente su precio: ");
			producto1 = entrada.readLine();
			System.out.println("El producto ingresado es: " + producto1);
			double importe1;
			importe1 = 56.30;
			System.out.println("y su precio es= $" + importe1);
			
			String producto2;
			System.out.println("Por favor, ingrese el siguiente producto a facturar y le mostraremos automáticamente su precio: ");
			producto2 = entrada.readLine();
			System.out.println("El producto ingresado es: " + producto2);
			double importe2;
			importe2 = 47.80;
			System.out.println("y su precio es= $" + importe2);
			
			double total;
			total = importe1 + importe2;
			System.out.println("El total de la compra es= $" + total + " y a continuación le imprimiremos su factura");
			
			System.out.println("\nSU FACTURA\n \nFactura \t\t" + tipoDeFactura + "\t\t" + numeroDeFactura + "\nNombre y Apellido\t" + nombreDeCliente + "\nProducto\t\t\t\tImporte\n" + producto1 + "\t\t\t\t\t" + importe1 + "\n" + producto2 + "\t\t\t\t" + importe2 + "\nImporte total\t\t\t\t" + total);
		
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
				
	}

}
