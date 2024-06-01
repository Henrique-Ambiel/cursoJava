//Sem encapsulamento

/* public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa pessoaBr = new Pessoa();
		
		pessoaBr.nome = "Henrique";
		pessoaBr.nacionalidade = "Brasileiro";
		pessoaBr.idade = 19;
		
		System.out.println(pessoaBr.nome);
		System.out.println(pessoaBr.nacionalidade);
		System.out.println(pessoaBr.idade);
		
		Pessoa pessoaMe = new Pessoa();
		
		pessoaMe.nome = "Bolaños";
		pessoaMe.nacionalidade = "Mexicano";
		pessoaMe.idade = 30;
		
		System.out.println(pessoaMe.nome);
		System.out.println(pessoaMe.nacionalidade);
		System.out.println(pessoaMe.idade);
		
		Pessoa pessoaUs = new Pessoa("Jeff","Estadunidense", 26);
		
		System.out.println(pessoaUs.nome);
		System.out.println(pessoaUs.nacionalidade);
		System.out.println(pessoaUs.idade);		
	}

} */

//Com encapsulamento

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa pessoaBr = new Pessoa();
		
		pessoaBr.setNome("Henrique");
		pessoaBr.setNacionalidade("Brasileiro");
		pessoaBr.setIdade(19);
		
		System.out.println(pessoaBr.getNome());
		System.out.println(pessoaBr.getNacionalidade());
		System.out.println(pessoaBr.getIdade());
		
		Pessoa pessoaMe = new Pessoa();
		
		pessoaMe.setNome("Bolaños");
		pessoaMe.setNacionalidade("Mexicano");
		pessoaMe.setIdade(30);
		
		System.out.println(pessoaMe.getNome());
		System.out.println(pessoaMe.getNacionalidade());
		System.out.println(pessoaMe.getIdade());
		
		Pessoa pessoaUs = new Pessoa();
		
		pessoaUs.setNome("Jeff");
		pessoaUs.setNacionalidade("Estadunidense");
		pessoaUs.setIdade(26);
		
		System.out.println(pessoaUs.getNome());
		System.out.println(pessoaUs.getNacionalidade());
		System.out.println(pessoaUs.getIdade());
				
	}

}
