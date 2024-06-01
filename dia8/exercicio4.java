//Exercício 04

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		while (true) {
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto ou digite '0' para sair: "));
			
			if (preco == 0) {
				JOptionPane.showMessageDialog(null, "Programa encerrado.");
				break;
			}
			if (preco < 1) {
				JOptionPane.showMessageDialog(null, "Não é possível calcular o produto.");
			} else {
				double precoNovo = preco + (preco * 12/100);
				JOptionPane.showMessageDialog(null, "O valor do produto, com o acréscimo de 12%, é de: " + Math.round(precoNovo));
			}
		}

	}

}

