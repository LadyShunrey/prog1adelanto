
public class Clase3_ejemplo1y2 {

	public static void main(String[] args) {
		int i, j, res1, res2, res3;
		double a, b, res4, res5;
		i = 7;
		j = i;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		j = 3;
		System.out.println("j = " + j);
		
		a = 7.0;
		b = 3.0;
		res1 = i-j;
		res2 = i/j;
		res3 = i%j;
		res4 = a*b;
		res5 = a/4.0;
		
		System.out.println("Operador resta: i - j = " + res1);
		System.out.println("Operador división: i / j = " + res2);
		System.out.println("Operador resto(módulo): i % j = " + res3);
		System.out.println("Operador multiplicación: a * b = " + res4);
		System.out.println("Operador división: a / 4.0 = " + res5);
		//en todos los casos que siguen primero se resuelve la operación entre ()
		//y luego al resultado convertido en texto se lo concatena
		//esto ayuda a reducir la cantidad de variables que se utilizan
		System.out.println("Operador resto: i - j = " + (i-j));
		System.out.println("Operador division: i / j = " + (i/j));
		System.out.println("Operador resto: i % j = " + (i%j));
		System.out.println("Operador multiplicacion: a * b = " + (a*b));
		System.out.println("Operador division: a / 4.0 = " + (a/4.0));
	}
}