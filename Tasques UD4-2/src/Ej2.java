
public class Ej2 {

	public static void main(String[] args) {

		int n = 8;
		double a = 5.75;
		char c = 'j';
		
		System.out.println("Variable N = " + n);
		System.out.println("Variable A = " + a);
		System.out.println("Variable C = " + c);
		System.out.println(n + " + " + a + " = " + (n + a)); //sumamos varables 
		System.out.println(a + " - " + n + " = " + (a - n)); //restamos el valor int al double
		System.out.println("Valor numérico del carácter " + c + " = " + (int)c); //casteamos el caracter a int para saber su valor en ascii

	}

}
