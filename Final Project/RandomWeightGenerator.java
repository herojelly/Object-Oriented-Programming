/** Random Weight Generator */

public class RandomWeightGenerator {
	private int weight;
	
	public RandomWeightGenerator() {
		weight = (int)(Math.random() * 100) + 100;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
