/** Issuing City Generator */

public class IssuingCityGenerator {
	private String city;
	
	public IssuingCityGenerator(String country) {
		int random = (int)(Math.random() * 3);
		if (country.equals("Islamistan")) {
			switch (random) {
				case 0: city = "Siddarthanople"; break;
				case 1: city = "Durka-Durka City"; break;
				case 2: city = "Aquela"; break;
			}
		}
		else if (country.equals("United Federation of El Guacamole")) {
			switch (random) {
				case 0: city = "Rio Brillante"; break;
				case 1: city = "Ciudad del Pantano"; break;
				case 2: city = "Nueva Solucion"; break;
			}
		}
		else if (country.equals("People's Republic of Gongdong")) {
			switch (random) {
				case 0: city = "Dongzhou"; break;
				case 1: city = "Jincheng"; break;
				case 2: city = "Tianshang"; break;
			}
		}
		else if (country.equals("Zwambalia")) {
			switch (random) {
				case 0: city = "Swahililand"; break;
				case 1: city = "Msitu Mji"; break;
				case 2: city = "Ebowizamba"; break;
			}
		}
		else if (country.equals("Principality of Monte Cristo")) {
			switch (random) {
				case 0: city = "Stadt Deutschen"; break;
				case 1: city = "De Beurre"; break;
				case 2: city = "Lentokone"; break;
			}
		}
		else if (country.equals("Nation of Uru Rock")) {
			switch (random) {
				case 0: city = "Kangaroo Village"; break;
				case 1: city = "Abbottstown"; break;
				case 2: city = "Uru City"; break;
			}
		}
		else {
			switch (random) {
			case 0: city = "Washington D.C."; break;
			case 1: city = "Denver"; break;
			case 2: city = "Las Vegas"; break;
			}
		}
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
}