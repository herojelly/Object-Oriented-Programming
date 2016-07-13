
public class DateGenerator {
	private int month;
	private int year;
	private int day;
	
	public DateGenerator() {
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getDay() {
		return day;
	}
	
	@Override
	public String toString() {
		return "" + month + " / " + day + " / " + year;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
}
