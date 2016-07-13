/** Character Class */

public class Character {
	private int weight;
	private int height;
	private int pictureNumber;
	private String purposeOfVisit;
	private int durationOfVisit; // number of months
	
	public Character() {  // Default values
		weight = 0;
		height = 0;
		pictureNumber = 0;
		purposeOfVisit = "Default Purpose of Visit";
		durationOfVisit = 0;
	}
	
	public Character(int weight, int height, int pictureNumber, String purposeOfVisit, int durationOfVisit) {
		this.weight = weight;
		this.height = height;
		this.pictureNumber = pictureNumber;
		this.purposeOfVisit = purposeOfVisit;
		this.durationOfVisit = durationOfVisit;
	}
	
	/** Get Methods */
	public int getWeight() {
		return weight;
	}
	public int getHeight() {
		return height;
	}
	public int getPictureNumber() {
		return pictureNumber;
	}
	public String getPurposeOfVisit() {
		return purposeOfVisit;
	}
	public int getDurationOfVisit() {
		return durationOfVisit;
	}
	
	/** Set Methods */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setPictureNumber(int pictureNumber) {
		this.pictureNumber = pictureNumber;
	}
	public void setPurposeOfVisit(String purposeOfVisit) {
		this.purposeOfVisit = purposeOfVisit;
	}
	public void setDurationOfVisit(int durationOfVisit) {
		this.durationOfVisit = durationOfVisit;
	}
}
