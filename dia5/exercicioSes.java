//Exercicio 06

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Insira o primeiro número: ");
		String aux2 = JOptionPane.showInputDialog("Insira o segundo número: ");
		
		Double numero1 = Double.valueOf(aux);
		Double numero2 = Double.valueOf(aux2);
		
		//Usa-se apenas "==" quando são variaveis primitivas, nesse caso o certo é: .equals()
		if (numero1.equals(numero2)) {
			JOptionPane.showMessageDialog(null, "Os dois números são iguais");
		} else {
			JOptionPane.showMessageDialog(null, "Maior valor entre " + numero1 + " e " + numero2 + " é: " + Math.max(numero1, numero2));
		}

	}

}
