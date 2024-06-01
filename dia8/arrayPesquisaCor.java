//Array de pesquisa de cor

import javax.swing.JOptionPane;

public class ArrayPesquisaCor {

	public static void main(String[] args) {
		String [] cores = {"Verde", "Amarelo", "Azul", "Vermelho", "Preto"};
		
		String cor = JOptionPane.showInputDialog("Forneça uma cor");
		
		String mensagem = "Cor não encontrada";
		
		for (int i = 0; i < cores.length; i++) {
			if(cores[i].equalsIgnoreCase(cor)) {
				mensagem = "Cor encontrada";
				break;
			}
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
