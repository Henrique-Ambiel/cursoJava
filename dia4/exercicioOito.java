// Exercício 08

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Insira uma string ");
		
		String maiusculo = input.toUpperCase();
		System.out.println("maiusculo: " + maiusculo);
		
		String minusculo = input.toLowerCase();
		System.out.println("minusculo: " + minusculo);

		JOptionPane.showMessageDialog(null, "Maiusculo: " + maiusculo);
		JOptionPane.showMessageDialog(null, "Minusculo: " + minusculo);


	}

}
