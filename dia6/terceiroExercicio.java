//Exercício 03

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Inserir número de notas: ");
		int qtdn = Integer.parseInt(aux);
		Double notaTotal = Double.valueOf(0);
		
		for (int i = 1; i <= qtdn; i++) {
			
			aux = JOptionPane.showInputDialog("Insira a nota " + i + ":");
			Double nota = Double.valueOf(aux);
			notaTotal = notaTotal + nota;
		}
		
		Double mediaFinal = notaTotal / qtdn;
		
		JOptionPane.showMessageDialog(null, "Média final: " + mediaFinal);

	}

}

