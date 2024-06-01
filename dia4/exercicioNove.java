// Exercício 09

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Insira uma string: ");
		String input2 = JOptionPane.showInputDialog("Insira uma nova string ");
		
		if(input.contains(input2)) {
			JOptionPane.showMessageDialog(null, "A segunda string ocorre na primeira");
		} else {
			JOptionPane.showMessageDialog(null, "A segunda string não ocorre na primeira");
		}
		
	}

}