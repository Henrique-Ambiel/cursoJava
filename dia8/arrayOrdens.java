//Arrays de ordens

import java.util.Arrays;

public class ArrayOrdens {

	public static void main(String[] args) {
		String[] nomes = {"Lucas", "Daniel", "Julia", "Tatiana", "Isabella", "Matheus"};
		Arrays.sort(nomes);
		System.out.println("Nomes: ");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		char[] vogais = {'i', 'u', 'a', 'o', 'e'};
		Arrays.sort(vogais);
		System.out.println("\nVogais: ");
		for (char vogal : vogais) {
			System.out.println(vogal);
		}
		
		int [] numeros = {9, 2, 6, 7, 3, 4, 8, 5, 1, 0};
		Arrays.sort(numeros);
		System.out.println("\nNumeros: ");
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		float[] notas = {7.6f, 8.5f, 9.7f, 5.4f, 7.4f};
		Arrays.sort(notas);
		System.out.println("\nNotas: ");
		for (float nota : notas) {
			System.out.println(nota);
		}
		
		Integer tamanhoArrayNomes = nomes.length;
		System.out.println("\n" + tamanhoArrayNomes);
		
		Integer tamanhoArrayNumeros = numeros.length;
		System.out.println("\n" + tamanhoArrayNumeros);
 
	}

}