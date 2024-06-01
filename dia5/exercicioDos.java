//Exercicio 02

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		//Usuario insere o número
		String aux = JOptionPane.showInputDialog("Insira um número decimal: ");
		
		//Converter string para double
		Double numeroDecimal = Double.valueOf(aux);
		
	    //Converter double para integer
		Integer numero = numeroDecimal.intValue();
		
		//Imprimir para o usuário
		JOptionPane.showMessageDialog(null, "Valor: " + numero);
		
	}

}
