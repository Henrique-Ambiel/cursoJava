//Exercício 02

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		String aux;
		String resultadoFinal = "";
		int numero;
		
		aux = JOptionPane.showInputDialog("Insira a tabuada que deseja saber");
		int numero2 = Integer.parseInt(aux);
		
		
		for (numero = 1; numero <= 10; numero++) {
			int resultado = numero2 * numero;
			String valorTabuada = numero2 + " X " +  numero + " = " + resultado;
			resultadoFinal = resultadoFinal + valorTabuada + "\n";
			
		}
		JOptionPane.showMessageDialog(null, resultadoFinal);

	}

}