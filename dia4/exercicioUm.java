// Exercício 01

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc;
		int idade;
		
		System.out.print("Entre com sua idade: ");
		sc = new Scanner(System.in);
		idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.print("Maior de idade");
		} else {
			System.out.print("Menor de idade");
		}
		sc.close();

	}

}