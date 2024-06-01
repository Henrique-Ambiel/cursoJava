// Operadores Aritméticos

public class OperadoresAritméticos {

	public static void main(String[] args) {
		// Declaração e inicialização das variaveis
		int x = 10;
		int y = 3;
		
		//Operações diversas com as variaveis
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("-x = " + (-x));
		
		System.out.println("x*y = " + (x * y));
		System.out.println("x/y = " + (x / y));
		
		System.out.println("Resto de x por y = " + (x % y));
		System.out.println("Inteiro de x por y = " + (int) (x % y));
		
		System.out.println("x + 1 = " + (int) (++x));
		System.out.println("y - 1 = " + (int) (--y));
	
	}

}