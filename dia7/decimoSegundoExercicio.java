//Exercício 12

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Inserira um número inteiro: ");
		int n = Integer.parseInt(aux);
		
		String output = "Número | Quadrado | Cubo\n";
		output += "-------------------------------------\n";
		
		for (int i = 1; i <= n; i++) {
			double quadrado = (int) Math.pow(i, 2);
			double cubo = (int) Math.pow(i, 3);
			
			output += i + "              | " + quadrado + "              | " + cubo + "\n";
			
		}
		JOptionPane.showMessageDialog(null, output);
	}

}

