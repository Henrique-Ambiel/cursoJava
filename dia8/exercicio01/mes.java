public class Mes {
	public static String getMesPorExtenso(int mes, int idioma) {
		switch (mes) {
		case 1: 
			return idioma == 1 ? "Janeiro" : "January";
		case 2: 
			return idioma == 1 ? "Fevereiro" : "February";
		case 3: 
			return idioma == 1 ? "Março" : "March";
		case 4: 
			return idioma == 1 ? "Abril" : "April";
		case 5: 
			return idioma == 1 ? "Maio" : "May";
		case 6: 
			return idioma == 1 ? "Junho" : "June";
		case 7: 
			return idioma == 1 ? "Julho" : "July";
		case 8: 
			return idioma == 1 ? "Agosto" : "August";
		case 9: 
			return idioma == 1 ? "Setembro" : "September";
		case 10: 
			return idioma == 1 ? "Outubro" : "October";
		case 11: 
			return idioma == 1 ? "Novembro" : "November";
		case 12: 
			return idioma == 1 ? "Dezembro" : "December";
			default: 
				return "Mês desconhecido";
		}
		
	}

}