// Exercício 03

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc;
		int numero;
		
		System.out.print("Entre com um número: ");
		sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.print("Número é par");
		} else {
			System.out.print("Número é ímpar");
		}
		
		sc.close();
	}

}