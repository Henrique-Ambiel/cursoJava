//Classe Wrapper Unboxing

public class ClasseWrapperUnboxing {

	public static void main(String[] args) {
		//Convertendo Integer to int
		Integer a = new Integer(3);
		int i = a.intValue();//Convertendo Integer em int de maneira explícita
		int j = a;//Unboxing, agora estamos convertendo a classe Integer em uma tipo de int (Internamente= a.intValue())

		System.out.println(a +  " " + i + " " + j);
	}

}