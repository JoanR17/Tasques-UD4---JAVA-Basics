
public class Ej3 {

	public static void main(String[] args) {

		int x = 17, y = 8;
		double n = 2.33, m = 4.20;
		
		//Variables
		System.out.println("Variable X = " + x);
		System.out.println("Variable Y = " + y);
		System.out.println("Variable N = " + n);
		System.out.println("Variable M = " + m + "\n\n");
		
		//Operadores enteros
		System.out.println("La suma de " + x + " + " + y + " = " + (x + y)); 
		System.out.println("La diferencia de " + x + " - " + y + " = " + (x - y)); 
		System.out.println("El producto de " + x + " * " + y + " = " + (x * y)); 
		System.out.println("El cociente de " + x + " / " + y + " = " + (x / y)); 
		System.out.println("El resto de " + x + " % " + y + " = " + (x % y) + "\n\n"); 
		
		//Operadores Decimales
		System.out.println("La suma de " + n + " + " + m + " = " + (n + m)); 
		System.out.println("La diferencia de " + n + " - " + m + " = " + (n - m)); 
		System.out.println("El producto de " + n + " * " + m + " = " + (n * m)); 
		System.out.println("El cociente de " + n + " / " + m + " = " + (n / m)); 
		System.out.println("El resto de " + n + " % " + m + " = " + (n % m) + "\n\n"); 
		
		//Operadores mixtos
		System.out.println("La suma de " + x + " + " + n + " = " + (n + x)); 
		System.out.println("El cociente de " + y + " / " + m + " = " + (y / m)); 
		System.out.println("El resto de " + y + " % " + m + " = " + (y % m) + "\n\n"); 
		
		//El doble de las variables
		System.out.println(x + " * 2 = " + (x * 2));
		System.out.println(y + " * 2 = " + (y * 2));
		System.out.println(n + " * 2 = " + (n * 2));
		System.out.println(m + " * 2 = " + (m * 2) + "\n\n");
		
		//Suma y multiplicación de todas las variables
		System.out.println(x + " + " + y + " + " + n + " + " + m + " = " + (x + y + n + m));
		System.out.println(x + " * " + y + " * " + n + " * " + m + " = " + (x * y * n * m));

	}

}
