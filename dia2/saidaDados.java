//Saída de dados

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		// Imprimindo um valor decimal
		double y = 10.34567;
		System.out.println(y);
		System.out.printf("%.2f%n", y);
		System.out.printf("%.4f%n", y);
		
		//Alterando de virgula para ponto 		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", y);
		
		//Concatenando valores 		
		System.out.println("RESULTADO: " +y+ "metros");
		System.out.printf("RESULTADO: %.2f metros%n",y);
		
		//Concatenado diferentes variáveis 
		String nome = "Luiz";
		int idade = 25;
		double renda = 2000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}