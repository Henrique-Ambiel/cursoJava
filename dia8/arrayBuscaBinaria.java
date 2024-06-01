//Array de busca binária

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayBuscaBinaria {

	public static void main(String[] args) {
		int [] numeros = new int [1000];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 1000);
		}
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número: "));
		
		String mensagens = "Valor não encontrado";
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == valor) {
				mensagens = "Valor encontrado na posição " + i;
				break;
			}
		}
		
		System.out.println(mensagens);
		
		Arrays.sort(numeros);
		int pos = Arrays.binarySearch(numeros, valor);
		System.out.println("Nova posição ordenada " + pos);
	}

}