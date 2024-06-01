//Exercício 10

import javax.swing.JOptionPane;

public class Exercicio16 {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Inserir número de casos: ");
		int qtdn = Integer.parseInt(aux);
		
		for(int i = 0; i <qtdn; i++) {
			String aux2 = JOptionPane.showInputDialog("Inserir número 1: ");
		    double numero1 =Double.parseDouble(aux2);
		    
		    String aux3 = JOptionPane.showInputDialog("Inserir número 2: ");
		    double numero2 =Double.parseDouble(aux3);
		    
		    double math = numero1 / numero2;
		    
		    if(numero2 == 0) {
		    	JOptionPane.showMessageDialog(null, "Divisão impossível de realizar");
		    } else {
		    	JOptionPane.showMessageDialog(null, "Resultado: " + math);
		    }
		}
		
	}

}
