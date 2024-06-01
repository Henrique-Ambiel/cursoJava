// Exercício 07

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Insira uma string: ");
		
		int length = input.length();
		
		JOptionPane.showMessageDialog(null, "O tamanho da string é: " + input);
	}

}