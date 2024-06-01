//Entrada de dados

import javax.swing.JOptionPane;

public class EntradaDeDadosComMetodos {
	
	private static String aux = "";
	
	public static String lerString(String mensagem) {
		aux = JOptionPane.showInputDialog(mensagem);
		return aux;
	}
	
	public static int lerNumeroInt(String mensagem) {
		aux = JOptionPane.showInputDialog(mensagem);
		int numeroRecuperado = Integer.parseInt(aux);
		return numeroRecuperado;
	}
	
	public static double lerNumeroDouble(String mensagem) {
		aux = JOptionPane.showInputDialog(mensagem);
		double numeroRecuperado = Double.parseDouble(aux);
		return numeroRecuperado;
	}
}