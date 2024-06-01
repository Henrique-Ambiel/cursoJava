//Exercício 05

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Insira uma frase: ");
		aux = aux.toLowerCase();
		int contarVogais = 0;

		for (int i = 0; i < aux.length(); i++) {
			char letra = aux.charAt(i);

			if (letra == 'a' || letra == 'e' || letra == 'i' 
					|| letra == 'o' || letra == 'u') {
				contarVogais++;
			}

		}
		JOptionPane.showMessageDialog(null, "Número de vogais: " + contarVogais);
	}

}