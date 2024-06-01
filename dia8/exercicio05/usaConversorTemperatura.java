import javax.swing.JOptionPane;

public class usaConversorTemperatura {

	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Insira a temperatura em Celsius: ");
		Double celsius = Double.valueOf(aux);
		JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + ConversorTemperatura.converteTemperatura(celsius));
	}
}
