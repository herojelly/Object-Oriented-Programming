/** Countries Of Entry Generator */
public class CountriesOfEntryGenerator {
	private String[] countries;
	private boolean allowedIslamistan, allowedGuacamole, allowedGongdong, allowedZwambalia,
					allowedMonteCristo, allowedUruRock, allowedUSA;
	
	public CountriesOfEntryGenerator() {
		countries = new String[7];
		countries[0] = "USA";
		int numOfCountries = (int)(Math.random() * 7);
		for (int i = 1; i < numOfCountries; i++) {
			int randomCountry = (int)(Math.random() * 7);
			switch (randomCountry) {
				case 0: 
					if (!allowedIslamistan) {
						countries[i] = "Islamistan"; 
						allowedIslamistan = true; 
						break;
					}
				case 1: 
					if (!allowedGuacamole) {
						countries[i] = "United Federation of El Guacamole"; 
						allowedGuacamole = true; 
						break;
					}
				case 2: 
					if (!allowedGongdong) {
						countries[i] = "People's Republic of Gongdong"; 
						allowedGongdong = true; 
						break;
					}
				case 3: 
					if (!allowedZwambalia) {
						countries[i] = "Zwambalia"; 
						allowedZwambalia = true; 
						break;
					}
				case 4: 
					if (!allowedMonteCristo) {
						countries[i] = "Principality of Monte Cristo"; 
						allowedMonteCristo = true; 
						break;
					}
				case 5: 
					if (!allowedUruRock) {
						countries[i] = "Nation of Uru Rock"; 
						allowedUruRock = true; 
					}
			}
		}
	}
	
	public String[] getCountries() {
		return countries;
	}
	
	public void setCountries(String[] countries) {
		this.countries = countries;
	}

}
