// Exercício 06

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		//Variaveis
		String aux;
		int idade, tempoDeContribuicao; 
		boolean elegibilidadeAposentadoria = false;
		char sexo;
		
		//Captura de dados
		aux = JOptionPane.showInputDialog("Idade: ");
		idade = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Tempo de contribuição: ");
		tempoDeContribuicao = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Sexo: ");
		sexo = aux.charAt(0);
		
		//Verificando a situação da aposentadoria
		if (sexo == 'f' || sexo == 'F') {
			
			if (idade >= 60 && tempoDeContribuicao >= 30) {
				elegibilidadeAposentadoria = true;
			} else {
				JOptionPane.showMessageDialog(null, "Faltam " + (60 - idade) + " anos de idade para aposentar-se\n" 
						+ "Faltam " + (30 - tempoDeContribuicao) 
						+ " anos de contribuição para aposentar-se");
			}
			
		} 
		
		if (sexo == 'm' || sexo == 'M') {
			
			if (idade >= 65 && tempoDeContribuicao >= 35) {
				elegibilidadeAposentadoria = true;
			} else {
				JOptionPane.showMessageDialog(null, "Faltam " + (65 - idade) + " anos de idade para aposentar-se\n"
						+ "Faltam " + (35 - tempoDeContribuicao) 
						+ " anos de contribuição para aposentar-se");
		    }
			
		}
		
		if (elegibilidadeAposentadoria == true) {
			JOptionPane.showMessageDialog(null, "Você já tem direito a aposentadoria");
		}
		
	}

}
