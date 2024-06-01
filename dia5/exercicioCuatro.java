//Exercicio 04

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		//Solicitando número ao usuário
		String aux = JOptionPane.showInputDialog("Insira um número: ");
		String aux2 = JOptionPane.showInputDialog("Insira o valor da potênica em que o número será elevado: ");
		
		Double numero1 = Double.valueOf(aux);
		Double numero2 = Double.valueOf(aux2);
		
		JOptionPane.showMessageDialog(null, "O resultado é: " + Math.pow(numero1, numero2));

	}

}