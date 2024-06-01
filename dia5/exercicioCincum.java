//Exercicio 05

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Insira um número: ");
		
		Double numeroInteiro = Double.valueOf(aux);
		
		JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numeroInteiro + " é: " + Math.sqrt(numeroInteiro));

	}

}