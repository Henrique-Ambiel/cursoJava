// Exercício 04

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Insira um numero: ");
		
		
		if (numero != null)
			switch (numero) {
			case "1":
				numero = "Domingo";
				break;
			case "2":
				numero = "Segunda-Feira";
				break;
			case "3":
				numero = "Terça-feira";
				break;
			case "4":
				numero = "Quarta-feira";
				break;
			case "5":
				numero = "Quinta-feira";
				break;
			case "6":
				numero = "Sexta-feira";
				break;
			case "7": 
				numero = "Sabádo";
				break;
				
			default: 
				numero = "Dia desconhecido";
		}
		JOptionPane.showMessageDialog(null, numero);
		
}

}
