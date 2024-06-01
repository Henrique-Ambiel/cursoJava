// Exercício 07

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		
		//Variaveis
		String aux;
		float valorTotal;
		double gorjeta = 0; 
		
		//Captura de dados
		aux = JOptionPane.showInputDialog("Insira o valor total da conta: ");
		valorTotal = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Avalie nosso serviço:\n"
				+ "1 - Excelente \n " 
				+ "2 - Bom \n"
				+"3 - Regular \n");
		
		int opcao = Integer.parseInt(aux);
		
		//Calculo da gorjeta do garçom
		
		if (opcao == 1) {
			gorjeta = 0.2;
		} else if (opcao == 2) {
			gorjeta = 0.15;
		} else if (opcao == 3 ) {
			gorjeta = 0.1;
		}
		double gorjetinha = valorTotal * gorjeta; 
		JOptionPane.showMessageDialog(null, "O valor da gorjeta é de: " + gorjetinha);
	}

}