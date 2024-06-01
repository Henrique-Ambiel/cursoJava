//Exercício 13

public class Exercicio13 {
	public static void main(String[] args) {
		//Variaveis e solicitação das palavras ao usuário
		char c;
		boolean anagrama = true;
		String aux = JOptionPane.showInputDialog("Inserir palavra: ");
		String aux2 = JOptionPane.showInputDialog("Inserir outra palavra: ");
		
		//Convertendo as strings todas em minusculo
		aux = aux.toLowerCase().trim();
		aux2 = aux2.toLowerCase().trim();
		
		//Verificando o tamanho das strings
		if (aux.length() != aux2.length()) {
			anagrama = false;
		}
		
		//Verificando se as palavras possuem as mesmas letras
			for (int i = 0; i<aux.length(); i++) {
				c = aux.charAt(i);
				if(c != ' ') {
					if(aux2.indexOf(c) == -1) {
						anagrama = false;
						break;
					}
				}
			}
			for (int i = 0; i<aux2.length(); i++) {
				c = aux2.charAt(i);
				if(c != ' ') {
					if(aux.indexOf(c) == -1) {
						anagrama = false;
						break;
					}	
		}
	  }
			//Imprimindo o resultado ao usuário
			if (anagrama) {
				JOptionPane.showMessageDialog(null, "As palavras são anagramas");
			} else {
				JOptionPane.showMessageDialog(null, "As palavras não são anagramas");
			}
   }
}

