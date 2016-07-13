/** Random Height Generator */

public class RandomHeightGenerator {
	private int height;
	
	public RandomHeightGenerator() {
		height = (int)(Math.random() * 24) + 54;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
}
