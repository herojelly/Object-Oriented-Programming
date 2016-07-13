/** Purpose of Entry Generator */

public class PurposeOfEntryGenerator {
	private String purposeOfEntry;
	
	public PurposeOfEntryGenerator() {
		int randomNum = (int)(Math.random() * 4); 	// Generates random number between 0 and 3
		switch (randomNum) { 						// determines purpose of entry using random number
			case 0: purposeOfEntry = "Visit"; break;
			case 1: purposeOfEntry = "Travel"; break;
			case 2: purposeOfEntry = "Work"; break;
			case 3: purposeOfEntry = "Diplomat"; break;
		}
	}
	
	public String getPurpose() {
		return purposeOfEntry;
	}
	
	public void setPurpose(String purposeOfEntry) {
		this.purposeOfEntry = purposeOfEntry;
	}
}
