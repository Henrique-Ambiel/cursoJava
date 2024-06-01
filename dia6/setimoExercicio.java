//Exercício 07

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Inserir número inteiro e positivo: ");
		Integer numeroInt = Integer.parseInt(aux);
		String mensagem = "";
		
		
		if(numeroInt <= 1000 && numeroInt >= 1) {
			
		mensagem = "Números ímpares de 1 até " + numeroInt + ":\n"; 
		for (int i = 1; i <= numeroInt; i++) {
			if (i % 2 != 0) {
		        System.out.println("Valores impares: " + i);
			} 
		} 
		} else {
			System.out.println("Número inválido");
		}
	}

}
