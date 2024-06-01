//Exercício 09

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Inserir número de casos: ");
		int qtdn = Integer.parseInt(aux);
	
		for(int i = 0; i <qtdn; i++) {
			String aux2 = JOptionPane.showInputDialog("Inserir nota 1: ");
		    double nota1 =Double.parseDouble(aux2);
		    
		    String aux3 = JOptionPane.showInputDialog("Inserir nota 2: ");
		    double nota2 =Double.parseDouble(aux3);
		    
		    String aux4 = JOptionPane.showInputDialog("Inserir nota 3: ");
		    double nota3 =Double.parseDouble(aux4);
		    
		    double media = (nota1 * 2 + nota2 * 3 + nota3 *5) / 10;
		    
		    JOptionPane.showMessageDialog(null, "Média ponderada: " + String.format("%.2f", media));
	}
		
 }
}