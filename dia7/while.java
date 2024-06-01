//Uso do "While"

import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {
	int contador = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
	
	while(contador >= 0) {
		System.out.println(contador);
		contador--;
	}
	System.out.println("Fim do contador regressivo\n");
	
	contador = 0;

	}

}
