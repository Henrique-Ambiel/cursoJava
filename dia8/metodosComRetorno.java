//Métodos com retorno

public class MetodosComRetorno {
	public static double somar(double a, double b) {
		return a + b;
	}
	
	public static String mostrarPares(int valor) {
		String retorno = "";
		for (int a = 0; a <= valor; a = a + 2) {
			retorno += a + " ";
		}
		return retorno;
	}
	
	public static int contarLetrasA(String palavra) {
		int quantidade = 0;
		palavra = palavra.toUpperCase();
		for (int a = 0; a <= palavra.length(); a++) {
			quantidade++;
		}
		return quantidade;
	}
	
	public static String mostrarDiaPorExtenso(int dia) {
		String extenso = "Domingo";
		if (dia == 2) {
			extenso = "Segunda-Feira";
		} else if (dia == 3) {
			extenso = "Terça-Feira";
		} else if (dia == 4) {
			extenso = "Quarta-Feira";
		} else if (dia == 5) {
			extenso = "Quinta-Feira";
		} else if (dia == 6) {
			extenso = "Sexta";
		} else if (dia == 7) {
			extenso = "Sábado";
		}
		return extenso;
	}
	
	public static void main(String[] args) {
		System.out.println(MetodosComRetorno.somar(3, 5));
		System.out.println(MetodosComRetorno.mostrarPares(100));
		System.out.println(MetodosComRetorno.mostrarDiaPorExtenso(7));
		System.out.println(MetodosComRetorno.contarLetrasA("Banana"));
	}
}
