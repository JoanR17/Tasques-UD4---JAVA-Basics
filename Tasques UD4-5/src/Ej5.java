
public class Ej5 {

	public static void main(String[] args) {
		
		int a = 5, b = 17, c = 99, d = 8;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		int aux = b; //Utilizamos una variable auxiliar para no perder los datos de b.
		b = c;
		c = a;
		a = d;
		d = aux;
		
		System.out.println("\nCambiamos b-c, c-a, a-d, d-b:\n");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

	}

}
