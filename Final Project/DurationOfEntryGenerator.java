/** Duration of Visit Generator */

public class DurationOfEntryGenerator {
	private int duration;
	
	public DurationOfEntryGenerator() {
		duration = 1 + (int)(Math.random() * 24);
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
