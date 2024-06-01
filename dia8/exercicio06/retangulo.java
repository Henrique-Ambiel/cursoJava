public class Retangulo {
	
	public static double areaRetangulo(double largura, double altura) {
		double area;
		area = largura * altura;
		return area;
	}
	
	public static double perimetroRetangulo(double largura, double altura) {
		double perimetro;
		perimetro = 2 * (largura + altura);
		return perimetro;
	}
	
	public static double diagonalRetangulo(double largura, double altura) {
		double diagonal;
		diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
		return diagonal;
	}
}