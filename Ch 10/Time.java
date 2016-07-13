// Gregory Jerian
// Period 4
// Project 10.1

public class Time {
	private int hour, minute, second, totalSeconds;
	
	Time() {
		totalSeconds = (int)(System.currentTimeMillis() / 1000);
		hour = totalSeconds / 3600 % 24;
		minute = totalSeconds % 3600 / 60;
		second = totalSeconds % 60;
	}
	
	Time(long elapsedTime) {
		totalSeconds = (int)(elapsedTime / 1000);
		hour = totalSeconds / 3600 % 24;
		minute = totalSeconds % 3600 / 60;
		second = totalSeconds % 60;
	}
	
	Time(int newHour, int newMinute, int newSecond) {
		hour = newHour;
		minute = newMinute;
		second = newSecond;
	}
	
	int getHour() {
		return hour;
	}
	
	int getMinute() {
		return minute;
	}
	
	int getSecond() {
		return second;
	}
	
	void setTime(long elapsedTime) {
		totalSeconds = (int)(elapsedTime / 1000);
		hour = totalSeconds / 3600 % 24;
		minute = totalSeconds % 3600 / 60;
		second = totalSeconds % 60;
	}
	
}
