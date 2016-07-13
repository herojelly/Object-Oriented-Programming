
public class EntranceDateGenerator extends DateGenerator {

	public EntranceDateGenerator() {
		setMonth((int)(Math.random() * 12) + 1);
		setYear((int)(Math.random() * 3) + 2016);
		setDay((int)(Math.random() * 28) + 1);
	}

}
