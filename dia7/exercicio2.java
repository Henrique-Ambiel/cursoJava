//Exercício 02 

import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		Random random = new Random();
		int numeroSecreto = random.nextInt(100) + 1;
		int palpite;
		
		do {
			palpite = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o número entre 1 a 100: "));
			
			if (palpite < numeroSecreto) {
				JOptionPane.showMessageDialog(null, "Digite um número maior");
			} else if (palpite > numeroSecreto) {
				JOptionPane.showMessageDialog(null, "Digite um número menor");
			}
		} while (palpite != numeroSecreto);
		JOptionPane.showMessageDialog(null, "Parábens, você acertou o número " + numeroSecreto);
		
	}

}


