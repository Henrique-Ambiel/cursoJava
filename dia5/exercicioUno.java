//Exercicio 01

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		//Recuperar o número
		String aux = JOptionPane.showInputDialog("Insira um número inteiro: ");
		
		//Converter string em Integer (usando Integer.valueOf()
		Integer numeroInteiro = Integer.valueOf(aux);
		
		//Exibir o valor para o usuário
		JOptionPane.showMessageDialog(null, "Valor: " + numeroInteiro +
				"\nO nome da classe é: " +  numeroInteiro.getClass().getName());
	}

}