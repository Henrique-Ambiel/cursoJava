// Exercício 05

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Insira um numero: ");
		int aux = Integer.parseInt(numero);
		
		if (numero != null)
			switch (aux) {
			case 1:
				numero = "Um";
				break;
			case 2:
				numero = "Dois";
				break;
			case 3:
				numero = "Três";
				break;
			case 4:
				numero = "Quatro";
				break;
			case 5:
				numero = "Cinco";
				break;
				
			default: 
				numero = "Número não compreendido";
	}
		JOptionPane.showMessageDialog(null, numero);
}
}
