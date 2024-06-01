//Exercício 04

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Inserir número inteiro e positivo: ");
		Integer numeroInt = Integer.parseInt(aux);
		Integer fatorial = 1;
		
		if (numeroInt < 0) {
			JOptionPane.showMessageDialog(null, "Não é possivel fazer o cálculo");
		} else {
			
			for (int i = numeroInt; i >= 1; i--) {
				fatorial = fatorial * i;					
		}
			JOptionPane.showMessageDialog(null, numeroInt + "!= " + fatorial);
		}

	}
}
