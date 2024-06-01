// If encadeado

import javax.swing.JOptionPane;

public class IfEncadeado {

	public static void main(String[] args) {
		String mes = JOptionPane.showInputDialog("Froneça o número do mês: ");
		int aux = Integer.parseInt(mes);
		if (aux == 1) {
			mes = "Janeiro";
		} else if (aux == 2) {
			mes = "Fvereiro";
		} else if (aux == 3) {
			mes = "Março";
		} else if (aux == 4) {
			mes = "Abril";
		} else if (aux == 5) {
			mes = "Maio";
		} else if (aux == 6) {
			mes = "Junho";
		} else if (aux == 7) {
			mes = "Julho";
		} else if (aux == 8) {
			mes = "Agosto";
		} else if (aux == 9) {
			mes = "Setembro";
		} else if (aux == 10) {
			mes = "Outubro";
		} else if (aux == 11) {
			mes = "Novembro";
		} else if (aux == 12) {
			mes = "Dezembro";
		} else {
			mes = "Esse mês não existe";
		}
		JOptionPane.showMessageDialog(null, mes);
		System.exit(0);

	}

}
