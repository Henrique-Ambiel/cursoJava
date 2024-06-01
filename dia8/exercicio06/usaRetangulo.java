import javax.swing.JOptionPane;

public class usaRetangulo {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Insira o valor da largura: ");
		Double largura = Double.valueOf(aux);
		
		String aux2 = JOptionPane.showInputDialog("Insira o valor da altura: ");
		Double altura = Double.valueOf(aux2);
		
	    JOptionPane.showMessageDialog(null, "Área: " + Retangulo.areaRetangulo(altura, largura) + "\nPerímetro: " + 
	    Retangulo.perimetroRetangulo(altura, largura) + "\nDiagonal: " + Retangulo.diagonalRetangulo(altura, largura));
		
	}
}