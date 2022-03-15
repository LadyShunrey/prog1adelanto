/*Dado una caracter imprimir vocal a si es una a, vocal e si es una e, vocal i si es una i
*o indicar que no es ninguna de las opciones anteriores
*/


public class Clase4_Ejemplo9 {

	public static void main(String[] args) {

		char c = 'e';
		switch (c) {
			case 'a': {

				System.out.println("vocal a");
				break;

			}
		
			case 'e': {

				System.out.println("vocal e");
				break;

			}
			
			case 'i': {

				System.out.println("vocal i");
				break;

			}
			
			default: {

				System.out.println("Es una letra distinta de a, e, i");

			}
		
		}

	}
}