public class Senha {
	public static String gerar() {
		int qtdmc = 8;
		
		String[] caracteres = {
				
			"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
		};
		
		StringBuilder senha = new StringBuilder();
		
		for(int i = 0; i < qtdmc; i++) {
			int posicao = (int) (Math.random() * caracteres.length);
			senha.append(caracteres[posicao]);
		}
		return senha.toString();
	}

}