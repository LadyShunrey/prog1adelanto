/*Realizar un programa que dado dos números enteros y un carácter, todos ingresados por el usuario, muestre por
pantalla el resultado de la operación matemática básica considerando el valor del carácter. Si ingreso el caracter:
– ‘a’ la suma, ‘b’ la resta, ‘c’ la multiplicación y ‘d’ la división entre ambos números.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase6_ejemplo10 {

	public static void main(String[] args) {
		int numeroIngresado1;
		int numeroIngresado2;
		char caracterIngresado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Por favor ingrese un número entero: ");
			numeroIngresado1 = Integer.valueOf(entrada.readLine());
			System.out.println("Por favor ingrese otro número entero: ");
			numeroIngresado2 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un caracter entre la a y la d teniendo en cuenta que a=suma, b=resta, c=multiplica y d=divide: ");
			caracterIngresado = entrada.readLine().charAt(0);
			System.out.println("El primer número ingresado es: " + numeroIngresado1);
			System.out.println("El segundo número ingresado es: " + numeroIngresado2);
			System.out.println("El caracter ingresado es: " + caracterIngresado);
			if((caracterIngresado>='a') && (caracterIngresado<='d')){
				imprimir_resultados(caracterIngresado, numeroIngresado1, numeroIngresado2);
			}
			else{
				System.out.println("El caracter ingresado no está entre a y d por lo tanto no se puede realizar la operación");
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}	
	}
	public static void imprimir_resultados(char caracterIngresado, int numeroIngresado1, int numeroIngresado2){
		switch(caracterIngresado){
		case 'a':{
			System.out.println("Eligió a que es la suma entre "+numeroIngresado1+" y "+numeroIngresado2+" que es igual a " + (numeroIngresado1+numeroIngresado2));
			break;
		}
		case 'b':{
			System.out.println("Eligió b que es la resta entre "+numeroIngresado1+" y "+numeroIngresado2+" que es igual a " + (numeroIngresado1-numeroIngresado2));
			break;
		}
		case 'c':{
			System.out.println("Eligió c que es la multiplicación entre "+numeroIngresado1+" y "+numeroIngresado2+" que es igual a " + (numeroIngresado1*numeroIngresado2));
			break;
		}
		case 'd':{
			System.out.println("Eligió b que es la división entre "+numeroIngresado1+" y "+numeroIngresado2+" que es igual a " + (numeroIngresado1/numeroIngresado2));
			break;
		}
		default:{
			
		}
		}	
	}
}
