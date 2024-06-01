//Exercício 06

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		while(true) {
		String senha = JOptionPane.showInputDialog("Digite a senha: ");
			
			if (senha.equals("2002")) {
				JOptionPane.showMessageDialog(null, "Acesso permitido");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Senha Inválida");
			}
		}
	}
}