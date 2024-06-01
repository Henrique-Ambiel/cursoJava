//Exercício 06

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		for (int i = 2; i >= 0; i--) {
			
			String aux = JOptionPane.showInputDialog("Login: ");
			String aux2 = JOptionPane.showInputDialog("Senha: ");
			
			if (aux.equals("java") && aux2.equals("java")) {
				JOptionPane.showMessageDialog(null, "Usuário logado");
				break;
			} else {
				if (i == 0) {
			
					JOptionPane.showMessageDialog(null, "Esgotou suas tentativas");		
			} else {
				JOptionPane.showMessageDialog(null, "Erro ao logar, você tem " + i + " tentativas");
			}
		}

		
		}
	}
}