public class Contagem {
	
	public static void contar() {
		int i;
		for (i = 0; i <=10; i++)
		System.out.println(i);
		}

	
	public static void contar(int fim) {
		for (int i = 0; i <= fim; i++)
			System.out.println(i);
		}

	
	public static void contar(int inicio, int fim) {
		for (int i = inicio; i <= fim; i++)
			System.out.println(i);
		}
	}