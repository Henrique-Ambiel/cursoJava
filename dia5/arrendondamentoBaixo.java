//Arrendondamento para baixo

import javax.swing.JOptionPane;

public class AreendondamentoParaBaixo {

	public static void main(String[] args) {
		float nota = Float.parseFloat(JOptionPane.showInputDialog("Nota da prova: "));
		JOptionPane.showMessageDialog(null, "Nota origina: " + nota + "\n Arredondada para baixo: " + Math.floor(nota));
		System.exit(0);
	}

}
