// Gregory Jerian
// Period 4
// Project 10.1

public class ch10_1 {

	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
		
		Time time2 = new Time(555550000);
		System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
	}

}
