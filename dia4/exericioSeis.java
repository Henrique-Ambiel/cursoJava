// Exercício 06

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Insira o nome do produto: ");
		String aux = JOptionPane.showInputDialog("Insira o valor do produto: ");
		double valorP = Double.parseDouble(aux);
		
		if (valorP < 0) {
			JOptionPane.showMessageDialog(null, "O valor do produtdo não pode ser negativo");
		} else {
			double valorD = 0;
			if (valorP <50) {
				valorD = valorP;
			} else if (valorP >= 50 && valorP <200) {
				valorD = valorP * 0.95;
			} else if  (valorP >500) {
				valorD = valorP * 0.94;
			} else if (valorP <1000) {
				valorD = valorP * 0.93;
			} else if (valorP >= 1000) {
				valorD = valorP * 0.92;
			}
			JOptionPane.showMessageDialog(null, "Nome do produto: " + produto +
			"\nValor original: R$ " + valorP +
			"\nValor com desconto: R$ " + valorD);
		}
		
	}

}