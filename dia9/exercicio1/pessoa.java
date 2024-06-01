public class Pessoa {
	private String nome;
	private String nacionalidade;
	private int idade;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String nacionalidade, int idade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}