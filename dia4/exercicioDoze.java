// Exercício 12

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		//Recuperar o e-mail do usuário
		String email = JOptionPane.showInputDialog("Insira o seu e-mail: ");
		
		//Realizar a validação do e-mail
		int posicaoUltimoPonto = email.lastIndexOf(".");
		boolean emailEhValido = email.contains ("@")
				&& email.charAt(email.lastIndexOf("@") + 1) != '.'
				&&posicaoUltimoPonto > (email.lastIndexOf("@") + 1)
				&&posicaoUltimoPonto != (email.length() - 1);
				
		//Exibir o resultado da validação
		if (emailEhValido) {
			JOptionPane.showMessageDialog(null, "E-mail valido");
		} else {
			JOptionPane.showMessageDialog(null, "E-mail inválido");
		}
	}

}