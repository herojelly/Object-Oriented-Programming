
public class DateOfBirthGenerator extends DateGenerator {
	
	public DateOfBirthGenerator() {
		setMonth((int)(Math.random() * 12) + 1);
		setYear((int)(Math.random() * 60) + 1935);
		setDay((int)(Math.random() * 28) + 1);
	}
	
}