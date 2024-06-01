//Exercício 08

import javax.swing.JOptionPane;

public class Exercicios08 {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Inserira a quantidade de valores inteiros desejada: ");
		int numeroX = Integer.parseInt(aux);
	    Integer valorIn = 0;
	    Integer valorOut = 0;
		
		for (int i = 1; i <= numeroX; i++) {
			aux = JOptionPane.showInputDialog("Insira o valor: " + i);
			Integer valor = Integer.valueOf(aux);
			
			
			if(valor >= 10 && valor <= 20) {
				valorIn++;
			} else {
				 valorOut++;
			}
		}
		System.out.println("in: " + valorIn + "\nout: " + valorOut);
	}

}
