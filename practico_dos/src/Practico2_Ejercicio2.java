//Escribir un programa que imprima por pantalla la tabla de valores
//de verdad para el or y and por separado.


public class Practico2_Ejercicio2 {

	public static void main(String[] args) {

		
		//Operador, ejemplo booleano, ejemplo con numero, resultado
		//
		
		int numero1 = 1;
		int numero2 = 2;
		boolean or00 = (numero1>numero2) || (numero1>numero2);
		boolean or01 = (numero1>numero2)||(numero2>numero1);
		boolean or10 = (numero1<numero2)||(numero2<numero1);
		boolean or11 = (numero1<numero2)||(numero2>numero1);
		
		boolean and00 = (numero1==numero2) && (numero1==numero2);
		boolean and01 = (numero1==numero2) && (numero1==numero1);
		boolean and10 = (numero1==numero1) && (numero1==numero2);
		boolean and11 = (numero1==numero1) && (numero2==numero2);
		
		
		System.out.println("Operadores lógicos \n" );
		System.out.println("OPERADOR \t EJEMPLO BOOLEANO \t EJEMPLO NUMERICO \t RESULTADO \n");
		System.out.println("OR \t\t false||false \t\t (1>2) v (1>2) \t\t " +  or00 ) ;
		System.out.println("OR \t\t false||true \t\t (1>2) v (2>1) \t\t " +  or01 ) ;
		System.out.println("OR \t\t true||false \t\t (1<2) v (2<1) \t\t " +  or10 ) ;
		System.out.println("OR \t\t true||true \t\t (1<2) v (2>1) \t\t " +  or11 ) ;
		
		System.out.println("\nOPERADOR \t EJEMPLO BOOLEANO \t EJEMPLO NUMERICO \t RESULTADO \n");
		System.out.println("AND \t\t false&&false \t\t (1=2) ^ (1=2) \t\t " +  and00 ) ;
		System.out.println("AND \t\t false&&true \t\t (1=2) ^ (1=1) \t\t " +  and01 ) ;
		System.out.println("AND \t\t true&&false \t\t (1=1) ^ (1=2) \t\t " +  and10 ) ;
		System.out.println("AND \t\t true&&true \t\t (1=1) ^ (2=2) \t\t " +  and11 ) ;

	}

}
