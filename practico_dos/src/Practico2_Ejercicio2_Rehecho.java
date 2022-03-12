//Escribir un programa que imprima por pantalla la tabla de valores
//de verdad para el or y and por separado.


public class Practico2_Ejercicio2_Rehecho {

	public static void main(String[] args) {

		//Operador, ejemplo booleano, ejemplo con numero, resultado
	
		System.out.println("Operadores l�gicos \n" );
		System.out.println("OPERADOR \t EJEMPLO BOOLEANO \t RESULTADO \n");
		System.out.println("OR \t\t false||false \t\t " +  (Boolean.FALSE || Boolean.FALSE) ) ;
		System.out.println("OR \t\t false||true \t\t " +  (Boolean.FALSE || Boolean.TRUE) ) ;
		System.out.println("OR \t\t true||false \t\t " +  (Boolean.TRUE || Boolean.FALSE) ) ;
		System.out.println("OR \t\t true||true \t\t " +  (Boolean.TRUE || Boolean.TRUE) ) ;
		
		System.out.println("\nOPERADOR \t EJEMPLO BOOLEANO \t RESULTADO \n");
		System.out.println("AND \t\t false&&false \t\t " +  (Boolean.FALSE && Boolean.FALSE) ) ;
		System.out.println("AND \t\t false&&true \t\t " +  (Boolean.FALSE && Boolean.TRUE) ) ;
		System.out.println("AND \t\t true&&false \t\t " +  (Boolean.TRUE && Boolean.FALSE) ) ;
		System.out.println("AND \t\t true&&true \t\t " +  (Boolean.TRUE && Boolean.TRUE) ) ;

	}

}
