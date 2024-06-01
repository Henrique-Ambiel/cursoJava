public class Moto extends Automovel {
	
	private boolean temPartidaEletrica;

	public boolean isTemPartidaEletrica() {
		return temPartidaEletrica;
	}

	public void setTemPartidaEletrica(boolean temPartidaEletrica) {
		this.temPartidaEletrica = temPartidaEletrica;
	}
	
	@Override
	public void dirigir() {
		String partidaEletrica = temPartidaEletrica ? "com partida elétrica" : "sem partida elétrica";
	        System.out.println("Estou pilotando uma moto " + GetModelo() + " " + partidaEletrica);
	}
}
