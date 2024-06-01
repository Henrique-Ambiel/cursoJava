//Exercício 07

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		
		while(true) {
			int cx = Integer.parseInt(JOptionPane.showInputDialog("Digite a cordenada 'X': "));
			
			if (cx == 0) {
				JOptionPane.showMessageDialog(null, "Encerrando o programa");
				break;
			}
			
			int cy = Integer.parseInt(JOptionPane.showInputDialog("Digite a cordenada 'Y': "));
			
			if (cx > 0 && cy > 0) {
				JOptionPane.showMessageDialog(null, "Pertence ao primeiro quadrante");
			} else if (cx < 0 && cy > 0) {
				JOptionPane.showMessageDialog(null, "Pertence ao segundo quadrante");
			} else if (cx < 0 && cy < 0) {
				JOptionPane.showMessageDialog(null, "Pertence ao terceiro quadrante");
			} else if (cx > 0 && cy < 0){
				JOptionPane.showMessageDialog(null, "Pertence ao quarto quadrante");
			}
		}
	}
}