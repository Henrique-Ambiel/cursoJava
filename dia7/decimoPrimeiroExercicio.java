//Exercício 11

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Inserira um número inteiro: ");
		int n = Integer.parseInt(aux);
		
		String output = "Divisores de " + n + ":\n";
		
		for (int i = 1; i <= n ; i++) {
			 if( n % i == 0) {
				 output += i + "\n";
			 }
		}
		JOptionPane.showMessageDialog(null, output);
		
	}
		
}
