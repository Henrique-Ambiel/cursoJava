//Exercicio 03

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		//Usuario insere o valor da temperatura
		String aux = JOptionPane.showInputDialog("Insira a temperatura em Celsius: ");
		
		//Converter celsius para fahrenheit
		Double celsius = Double.valueOf(aux);
		Double fahrenheit  = (celsius * 9/5) + 32;
		
		//Imprimir o resultado para o usuario
		JOptionPane.showMessageDialog(null, "Temeperatura em Fahrenheit: " + fahrenheit);
				
	}

}
