public class Carro extends Automovel {
	
	private int numPortas;

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	@Override
	public void dirigir() {
	System.out.println("Estou dirigindo um(a) " + GetModelo() + " com " + numPortas + " portas ");
	}
}
