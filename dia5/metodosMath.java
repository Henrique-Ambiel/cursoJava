//Diversos Metodos Math

public class DiversosMetodosMath {

	public static void main(String[] args) {
	double a = 2.4, b = 2.8, c = 4, d = -1;
	
	System.out.println("Arrendondamento de " + a + " = " + Math.round(a));
	System.out.println("Arrendondamento de " + b + " = " + Math.round(b));
	System.out.println("Arrendondamento para cima " + b + " = " + Math.ceil(b));
	System.out.println("Arrendondamento para baixo " + b + " = " + Math.floor(b));
	System.out.println("Maior valor entre " + a + " e " + b + " = " + Math.max(a, b));
	System.out.println("Menor valor entre " + a + " e " + b + " = " + Math.min(a, b));
	System.out.println("O quadrado de " + c + " = " + Math.pow(c, 2));
	System.out.println("A raiz quadrada de " + c + " = " + Math.sqrt(c));
	System.out.println("Valor absoluto de " + d + " = " + Math.abs(d));
	}

}