//Exercício 03

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		double soma = 0;
		int contador = 0;
		
		while (true) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota (0 a 10) ou -1 para sair"));
			if (nota == -1) {
				break;
			}
			if(nota >= 0 && nota<= 10) {
				soma+= nota;
				contador++;
			} else {
				JOptionPane.showMessageDialog(null, "Digite uma nota entre 0 e 10");
			} 
		}
		if (contador > 0) {
			double media = soma/contador;
			JOptionPane.showMessageDialog(null, "A média é igual a: " + media);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhuma nota válida foi digitada");
		}

	}

}

