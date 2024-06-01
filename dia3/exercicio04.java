// Exercício 04

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//Variaveis utilizadas
		String aux;
		float valorVenal, valorNegociado, percentualImposto, valorImposto;
		
		//Captura de dados 
		aux = JOptionPane.showInputDialog("Entre com o valor venal: ");
		valorVenal = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Entre com o valor negociado: ");
		valorNegociado = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Entre com o percentual do imposto: ");
		percentualImposto = Float.parseFloat(aux);
		
		
		//Calculo do valor do Imposto
		if (valorVenal > valorNegociado) {
			valorImposto = valorVenal * percentualImposto/100;
		} else {
			valorImposto = valorNegociado * percentualImposto/100;		
		}
		JOptionPane.showMessageDialog(null, "Valor do Imposto: " + valorImposto);
	
	}

}