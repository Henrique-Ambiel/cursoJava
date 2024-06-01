// Exercício 02

import java.util.Scanner;

class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc;
		float numero;
		
		System.out.print("Entre com um número: ");
		sc = new Scanner(System.in);
		numero = sc.nextFloat();
		
		if (numero > 0) {
			System.out.print("Número positivo (+)");
		} else if (numero == 0) {
			System.out.print("Número neutro");
		} else {
			System.out.print("Número negativo (-)");
		}
		sc.close();
	}

}