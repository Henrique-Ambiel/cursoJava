//Array

public class MeuPrimeiroArray {

	public static void main(String[] args) {
		String [] nomes = new String [3];
		nomes [0] = "Eugenio";
		nomes [1] = "Haniery";
		nomes [2] = "Pedro";
		
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
		
		//loop for
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes);
		}
		
		//loop for-each
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}
}
