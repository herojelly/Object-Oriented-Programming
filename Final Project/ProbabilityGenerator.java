
public class ProbabilityGenerator {
	private int isSomethingWrong;
	private int whatIsWrong;
	
	public ProbabilityGenerator() {
		isSomethingWrong = (int)(Math.random() * 2); //Sees if something on passport is wrong (0 = wrong, 1 = right)
		if (isSomethingWrong == 0) {
			whatIsWrong = (int)(Math.random() * 13) + 1; // Finds what is wrong by choosing random value between 1 and 14
		}
		else
			whatIsWrong = 0; // If everything is right, whatIsWrong is set to 0
		
	}
	
	public boolean isPassportWrong() {
		if (isSomethingWrong == 0) 
			return true;
		else
			return false;
	}
	
	public String whatIsWrong() {
		switch (whatIsWrong) {
			case 0: return "Nothing"; // when whatIsWrong = 0, nothing is wrong
			case 1: return "Name";
			case 2: return "Weight";
			case 3: return "Height";
			case 4: return "Picture";
			case 5: return "Purpose of Visit";
			case 6: return "Duration of Visit";
			case 7: return "Issuing Country";
			case 8: return "Date of Birth";
			case 9: return "Sex";
			case 10: return "Issuing City";
			case 11: return "Expiration Date";
			case 12: return "Serial Number";
			case 13: return "Date of Entry";
			case 14: return "Wrong Documents";
		}
		return "error"; // code never gets executed
	}
	
}
