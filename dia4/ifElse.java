// If / Else

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeroSecreto = 42;
		
		System.out.println("Bem-vindo ao Jogo da Advinhação!");
		System.out.println("Tente advinhar o número secreto (entre 1 e 100): ");
		int palpite = scanner.nextInt();
		
		if(palpite == numeroSecreto) {
			System.out.println("Parabéns! Você acertou!");
		} else {
			System.out.println("Oops, você errou. O número secreto era " + numeroSecreto + ".");
		}

		scanner.close();
	}

}
