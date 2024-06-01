//Classe Wrapper Autoboxing

public class ClasseWrapperAutoboxing {

	public static void main(String[] args) {
	//Convertendo int em Integer
		int a = 20;
		Integer i = Integer.valueOf(a); //Convertendo int em Integer de maneira explícita
		Integer j = a; //Convertendo int em Integer por meio do autoboxing
		
		System.out.println(a +  " " + i + " " + j);

	}

}

