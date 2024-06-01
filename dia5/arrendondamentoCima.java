//Arrendondamento para cima

import javax.swing.JOptionPane;

public class ArrendondamentoParaCima {

	public static void main(String[] args) {
		final float LOTACAO_ONIBUS = 50;
		
		int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Número de passageiros?"));
		float qtdeOnibus = numeroPassageiros / LOTACAO_ONIBUS;
		
		JOptionPane.showMessageDialog(null, "Quantidade de passageiros: " + numeroPassageiros +
				"\nQuantidade calculada: " + qtdeOnibus + "\nQuantidade de ônibus necessários: " + 
				(int) Math.ceil(qtdeOnibus));
		
		System.exit(0);
	}

}