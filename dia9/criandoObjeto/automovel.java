public class Automovel {
	private String cor;
	private double preco;
	private String modelo;
	
	public Automovel() {
		System.out.println("Construtor padrão da classe automóvel");
	}
	
	public Automovel(String modelo, double preco) {
		this.modelo = modelo;
		this.preco = preco;
	}
	
	public Automovel(String cor, String modelo, double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	public String GetCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
		}
	
	public double GetPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String GetModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void dirigir() {
		System.out.println("Estou dirigindo um(a) " + modelo);
	}


}
