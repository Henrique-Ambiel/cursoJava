// Exercício 10

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Pesquisar: ");
		
		if(frase.toLowerCase().contains("basquete") || frase.toLowerCase().contains ("futebol")) {
			JOptionPane.showMessageDialog(null, "Conteúdo impróprio");
		} else {
			JOptionPane.showMessageDialog(null, "Conteúdo liberado");
		}
			
		
		
		
	}

}