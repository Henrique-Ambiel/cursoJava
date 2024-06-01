//Exercício 08

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while(true) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Esolha qual produto abastecer (se deseja sair, digite 4):\n"
					+ "1. Álcool\n" + "2. Gasolina\n" + "3. Diesel\n" + "4. Fim"));
			
			if (opcao > 4 || opcao < 1) {
				JOptionPane.showMessageDialog(null,"Número inválido, tente novamente.");
			}
			
			switch (opcao) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel ++;
				break;
			}
			
			if (opcao == 4) {
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "MUITO OBRIGADO\n" + "Álcool: " + alcool + " clientes\n" + "Gasolina: " + gasolina
				+ " clientes\n" + "Diesel: " + diesel + " clientes\n" );
	}
}

