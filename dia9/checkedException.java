//Checked Exception

import java.io.File;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		File testeArquivo = new File("C:/Temp/teste.txt");
		try {
			testeArquivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("testeArquivo existe: " + testeArquivo);
	}

}

