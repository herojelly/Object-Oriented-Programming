
public class PictureGenerator {
	private int pictureNumber;
	
	public PictureGenerator(boolean gender) {
		if (gender)
			pictureNumber = (int)(Math.random() * 20) + 1; // value subject to change
		else
			pictureNumber = (int)(Math.random() * 20) + 21; // value subject to change
	}
	
	public int getPictureNumber() {
		return pictureNumber;
	}
	
	public void setPictureNumber(int pictureNumber) {
		this.pictureNumber = pictureNumber;
	}
}
