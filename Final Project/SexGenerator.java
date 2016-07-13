/** Gender Class */

public class SexGenerator {
	private boolean sex;
	
	public SexGenerator() {
		int random = (int)(Math.random() * 2); //Generates sex
		if (random == 0)
			sex = true;
		else
			sex = false;
	}
	
	public boolean getSex() {
		return sex;
	}
	
	public char toChar() {
		if (sex)
			return 'M';
		else
			return 'F';
	}
	
	public void setSex(boolean sex) {
		this.sex = sex;
	}
}
