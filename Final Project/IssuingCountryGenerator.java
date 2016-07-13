/** Issuing Country Generator */

public class IssuingCountryGenerator {
	private String country;
	
	public IssuingCountryGenerator() {
		int random = (int)(Math.random() * 7);
		switch (random) {
			case 0: country = "Islamistan"; break;
			case 1: country = "United Federation of El Guacamole"; break;
			case 2: country = "People's Republic of Gongdong"; break;
			case 3: country = "Zwambalia"; break;
			case 4: country = "Principality of Monte Cristo"; break;
			case 5: country = "Nation of Uru Rock"; break;
			case 6: country = "USA";
		}
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
}
