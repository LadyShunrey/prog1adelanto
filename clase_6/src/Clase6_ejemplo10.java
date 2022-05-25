/*Realizar un programa que dado dos n�meros enteros y un car�cter, todos ingresados por el usuario, muestre por
pantalla el resultado de la operaci�n matem�tica b�sica considerando el valor del car�cter. Si ingreso el caracter:
� �a� la suma, �b� la resta, �c� la multiplicaci�n y �d� la divisi�n entre ambos n�meros.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase6_ejemplo10 {

	public static void main(String[] args) {
		int numeroIngresado1;
		int numeroIngresado2;
		char caracterIngresado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Por favor ingrese un n�mero entero: ");
			numeroIngresado1 = Integer.valueOf(entrada.readLine());
			System.out.println("Por favor ingrese otro n�mero entero: ");
			numeroIngresado2 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un caracter entre la a y la d teniendo en cuenta que a=suma, b=resta, c=multiplica y d=divide: ");
			caracterIngresado = entrada.readLine().charAt(0);
			System.out.println("El primer n�mero ingresado es: " + numeroIngresado1);
			System.out.println("El segundo n�mero ingresado es: " + numeroIngresado2);
			System.out.println("El caracter ingresado es: " + caracterIngresado);
			if((caracterIngresado>='a') && (caracterIngresado<='d')){
				imprimir_resultados(caracterIngresado, numeroIngresado1, numeroIngresado2);
			}
			else{
				System.out.println("El caracter ingresado no est� entre a y d por lo tanto no se puede realizar la operaci�n");
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}	
	}
	public static void imprimir_resultados(char caracterIngresado, int numeroIngresado1, int numeroIngresado2){
		switch(caracterIngresado){
		case 'a':{
			System.out.println("Eligi� a que es la suma entre "+numeroIngresado1+" y "+numeroIngresado2+" que es igual a " + (numeroIngresado1+numeroIngresado2));
			break;
		}
		case 'b':{
			System.out.println("Eligi� b que es la resta entre "+numeroIngresado1+" y "+numeroIngresado2+" que es igual a " + (numeroIngresado1-numeroIngresado2));
			break;
		}
		case 'c':{
			System.out.println("Eligi� c que es la multiplicaci�n entre "+numeroIngresado1+" y "+numeroIngresado2+" que es igual a " + (numeroIngresado1*numeroIngresado2));
			break;
		}
		case 'd':{
			System.out.println("Eligi� b que es la divisi�n entre "+numeroIngresado1+" y "+numeroIngresado2+" que es igual a " + (numeroIngresado1/numeroIngresado2));
			break;
		}
		default:{
			
		}
		}	
	}
}
