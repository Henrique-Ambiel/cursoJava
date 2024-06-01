//Try catch

import javax.swing.JOptionPane;

public class ExTryCatch1 {

	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Forneça o valor do primeiro número: "));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Forneça o valor do segundo número: "));
			
			JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
			JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
			JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
			JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));
		} catch (ArithmeticException erro) {
			JOptionPane.showMessageDialog(null, "Erro de divisão por 0\n" + erro.toString(), 
					"Erro", JOptionPane.ERROR_MESSAGE);
		} catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Erro de conversão\n" + erro.toString(), 
					"Erro", JOptionPane.ERROR_MESSAGE);
		} finally {
			JOptionPane.showMessageDialog(null, "Final da execução");
		}
	}

}