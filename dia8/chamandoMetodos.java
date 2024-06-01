//Chamando métodos

import javax.swing.JOptionPane;

public class ChamaMetodos {
	
	public static void main(String[] args) {
		String nome = EntradaDeDadosComMetodos.lerString("Forneça seu nome: ");
		int idade = EntradaDeDadosComMetodos.lerNumeroInt("Forneça sua idade: ");
		double altura = EntradaDeDadosComMetodos.lerNumeroDouble("Forneça sua altura: ");
		
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nidade: " + idade + "\nAltura: " + altura);
	}
}