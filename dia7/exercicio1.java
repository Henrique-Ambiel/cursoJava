//Exercício 01

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		boolean continuar = true;
		
		while(continuar) {
			double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número: "));
			double numero2 =Double.parseDouble(JOptionPane.showInputDialog("Insira outro número: "));
			
			Integer operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação:\n " + "1. Adição\n" + "2. Subtração\n" + "3. Multiplicação\n" 
					+ "4. Divisão\n" + "5. Sair"));
		
			switch (operacao) {
			case 1:
				JOptionPane.showMessageDialog(null, "Resultado é: " + (numero1 + numero2));
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Resultado é: " + (numero1 - numero2));
				break;
			case 3: 
				JOptionPane.showMessageDialog(null, "Resultado é: " + (numero1 * numero2));
				break;
			case 4:
				if (numero2 != 0) {
					JOptionPane.showMessageDialog(null, "Resultado é: " + (numero1 / numero2));
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Erro: divisão por 0");
				}
				break;
				default: 
					JOptionPane.showMessageDialog(null, "Número inválido, digite um número entre 1 a 5");
				    break;
			}
		}

	}

}
