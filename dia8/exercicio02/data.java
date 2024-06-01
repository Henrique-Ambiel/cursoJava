public class Data {
	public static int getDia(String data) {
		String dia = data.substring(0, 2);
		return Integer.parseInt(dia);
	}

	public static int getMes(String data) {
		String mes = data.substring(3, 5);
		return Integer.parseInt(mes);
	}

	public static int getAno(String data) {
		String ano = data.substring(6, 10);
		return Integer.parseInt(ano);
	}
}