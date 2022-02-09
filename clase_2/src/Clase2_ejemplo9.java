import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase2_ejemplo9 {

	public static void main(String[] args) {
		
		// El String es un tipo especial para almacenar texto
		//si solo se necesita un caracter deberia utilizar char
		String texto;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un texto: ");
			texto = entrada.readLine();
			System.out.println("El texto ingresado es: " + texto);

		}
		
		
		catch (Exception exc){
			System.out.println(exc);
		}
		
		
		
		//para leer textos desde consola no necesita convertirlo a String
				
		
	}

}
