
public class Clase3_ejemplo6 {

	public static void main(String[] args) {
		int i, j, k;
		boolean res;
		i = 7;
		j = 3;
		k = 2;
		//(i==j)||(i==k) primero se resuelven los paréntesis (i==j) y
		//(i==k), y luego ||. Finalmente el resultado queda en res
		res = (i==j)||(i==k);
		System.out.println("Operacion: (i==j)||(i==k) " + res);
		//((i!=j)||(i==k)) primero se resuelven los paréntesis (i!=j) y
		//(i==k), y luego ||
		System.out.println("Operacion: ((i!=j)||(i==k)) " + ((i!=j)||(i==k)));
		//((!(i!=j))||(i==k)) primero se resuelven los paréntesis (!(i!=j))
		//(i==k), y luego ||. Para resolver (!(i!=j)) primero se resuelve
		//(i!=j) y luego se le aplica ! (negacion)
		System.out.println("Operacion: ((!(i!=j))||(i==k)) " + ((!(i!=j))||(i==k)));
	}

}
