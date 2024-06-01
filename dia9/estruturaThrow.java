//Estrutura Throw

import javax.swing.JOptionPane;

public class InstrucaoThrows {

	public static void main(String[] args) {
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade: "));
			if(idade < 18) {
				throw new Exception("Menor de idade, entrada não permitida");
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro.toString()); 
					
		}
       }
}