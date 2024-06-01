//Sem encapsulamento

/*public class UsaAutomovel {

	public static void main(String[] args) {
		//Criando meu primeiro objeto a partir da Classe Automovel
		Automovel meuAutomovel = new Automovel();
		meuAutomovel.cor = "Branco";
		meuAutomovel.preco = 20000.00;
		meuAutomovel.modelo = "HB20";
		
		System.out.println(meuAutomovel.cor);
		System.out.println(meuAutomovel.preco);
		System.out.println(meuAutomovel.modelo);

	}

} */

//Com encapsulamento

public class UsaAutomovel {

	public static void main(String[] args) {
			Automovel carro2 = new Automovel();
			carro2.setCor("Branco");
			carro2.setPreco(20000.00);
			carro2.setModelo("Uno");
			
			System.out.println(carro2.GetCor());
			System.out.println(carro2.GetPreco());
			System.out.println(carro2.GetModelo());
	}

}