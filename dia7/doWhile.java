//Uso do "do While"

import javax.swing.JOptionPane;

public class UsoDoWhile {

	public static void main(String[] args) {
		int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		int contador = 0;
		
		do {
			System.out.println(contador);
			contador++;
		} while (contador <= limite);
		System.out.println("Fim do contador progresivo");
	}

}