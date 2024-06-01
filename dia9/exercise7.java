//Exercício 07

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		
	    int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas: "));

	    String [] nomes = new String [qtde];
		int [] idade = new int [qtde];
		double [] altura = new double [qtde];
    	
		int pessoasMenorDe16 = 0;
		
	    for(int i = 0; i <qtde; i++) {
	    	nomes[i] = JOptionPane.showInputDialog("Digite o nome " + (i + 1)+ " : ");
	    	
			idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade " + (i + 1)+ " : "));
			
			altura[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura " + (i + 1) + " : "));
			
			if(idade[i] < 16) {
			pessoasMenorDe16++;
			}
	    }	
	    
	    double alturaMedia = calcularAlturaMedia(altura);
	    double porcentagemMenosDe16 = (pessoasMenorDe16 / (double) qtde) * 100;
	    
	    
	    String mensagem = "Altura média das pessoas: " + String.format("%.2f", alturaMedia) + "\nPorcentagem de pessoas com menos de 16 anos: " 
		+ String.format("%.2f", porcentagemMenosDe16) + "%\n";
	       
	    if(pessoasMenorDe16 > 0) {
	    	String nomesMenorDe16 = obterNomesMenosDe16(idade, nomes);
	    	
	    	mensagem += "Nomes das pessoas menores de 16 anos:\n" + nomesMenorDe16;
	    }
	    JOptionPane.showMessageDialog(null, mensagem);
	}

	private static String obterNomesMenosDe16(int[] idade, String[] nomes) {
		StringBuilder nomesMenorDe16 = new StringBuilder();
		
		for (int i = 0; i < idade.length; i++) {
			if(idade[i] < 16) {
				nomesMenorDe16.append(nomes[i]).append("\n");
			}
		}
		return nomesMenorDe16.toString();
	}

	private static double calcularAlturaMedia(double[] altura) {
		double soma = 0;
		for(double alturas : altura) {
			soma += alturas;
		}
		return soma / altura.length;
	}

}