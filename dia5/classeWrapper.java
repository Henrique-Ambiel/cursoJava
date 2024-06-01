//Classe Wrapper

public class ClasseWrapper {

	public static void main(String[] args) {
	String stringWrapper = "Meu texto aqui";
	System.out.println("stringWrapper: " + stringWrapper);
	
	Integer integerWrapper = new Integer("40");
	System.out.println("integerWrapper: " + integerWrapper);
	Integer integerWrapper2 = new Integer(2800);
	System.out.println("integerWrapper2: " + integerWrapper2);
	
	Short shortWrapper = new Short("40");
	System.out.println("shortWrapper: " + shortWrapper);
	
	Long longWrapper = new Long("934798798798090");
	System.out.println("longWrapper: " + longWrapper);
	
	Byte byteWrapper = new Byte("23");
	System.out.println("byteWrapper: " + byteWrapper);
	
	Float floatWrapper = new Float("500.50");
	System.out.println("floatWrapper: " + floatWrapper);
	
	Double doubleWrapper = new Double("512.22");
	System.out.println("doubleWrapper: " + doubleWrapper);
	
	Character characterWrapper = new Character('a');
	System.out.println("characterWrapper: " + characterWrapper);
	
	Boolean booleanWrapper = new Boolean("true");
	System.out.println("boleanWrapper: " + booleanWrapper);
	}

}