//Exercício 05

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//Variaveis
		String aux;
		float prova1, prova2, trabalho, notaFinal; 

		//Captura de Dados
		aux = JOptionPane.showInputDialog("Nota da prova 1: ");
		prova1 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Nota da Prova 2: ");
		prova2 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Nota do trabalho: ");
		trabalho = Float.parseFloat(aux);
		
		//Calculando a média final
		
		notaFinal = (prova1 + prova2+ trabalho) / 3;
		
		if (notaFinal >= 6) {
			JOptionPane.showMessageDialog(null, "Nota Final: " + notaFinal + " Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Nota Final: " + notaFinal + " Reprovado");
		}
	}

}
