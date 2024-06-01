// Classe String

public class ClasseString {

	public static void main(String[] args) {
		String frase = "Aprendendo Java";
		String frasePeloConstrutor = new String("Aprendendo Java");
		
		//Para tudo ficar minusculo
		String minusculo = frase.toLowerCase();
		System.out.println("minusculo: " + minusculo);
		
		//Para tudo converter em maiusculo
		String maiusculo = frase.toUpperCase();
		System.out.println("maiusculo: " + maiusculo);
		
		
		//Lê a quantidade de caracteres
		Integer quantidadeDeCaracteres = frase.length();
		System.out.println(quantidadeDeCaracteres);
		
		
		//Retorna caracteres especificos
		System.out.println(frase.charAt(0));
		System.out.println(frase.charAt(5));
		System.out.println(frase.charAt(11));
		
		//Retorna uma cópia de caracteres
		System.out.println(frase.substring(11));
		System.out.println(frase.substring(0, 10));
		System.out.println(frase.substring(5, 10));
		
		//Remove todos os espaços em branco que aparecem no inicio e fim de frase (exceto entre palavras)
		String frase2 = " Aprendendo Java ";
		System.out.println(frase2);
		System.out.println(frase2.trim());
		
		//Substitui caracteres (precisa informar quais sao os caracteres)
		String frase3 = frase.replace("Aprendendo", "Capacitando em");
		System.out.println(frase3);
		System.out.println(frase3.replace("a", "i"));
		
		//Converte diversos tipos de dados em strings
		int a = 1000;
		long b = 500;
		float c = 20.45f;
		double d = 15.432;
 		String x = String.valueOf(a) + " " + String.valueOf(b) + " " + String.valueOf(c) + " " + String.valueOf(d) + " ";
 		System.out.println(x);
 		
 		//Encontra a posição dos caracteres ou substrings
 		String frase4 = "abcdefghij";
 		int indice1 = frase4.indexOf("e");
 		int indice2 = frase4.indexOf("z");
 		System.out.println(indice1);
 		System.out.println(indice2);
 		
 		//Encontra a posição da ultima ocorrencia de uma substring
 		String frase5 = "Aprenda Java, Java é divertido";
 		int posicao = frase5.lastIndexOf("Java");
 		System.out.println("A última ocorrência da da palavra 'Java' está na posição: " + posicao);
 		
 		//Verifica se uma sequencia de caracteres está dentro de outra string maior
 		System.out.println(frase.contains("Aprendendo"));
 		System.out.println(frase.contains("Poeta"));
	}

}

