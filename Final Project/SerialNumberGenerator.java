/** Serial Number Generator */

public class SerialNumberGenerator {
	private String serialNumber;
	private int num1, num2, num3, num4, num5, num6;
	
	public SerialNumberGenerator() {
		num1 = (int)(Math.random() * 10);
		num2 = (int)(Math.random() * 10);
		num3 = (int)(Math.random() * 10);
		num4 = (int)(Math.random() * 10);
		num5 = (int)(Math.random() * 10);
		num6 = (int)(Math.random() * 10);
		serialNumber = "" + num1 + num2 + num3 + "-" + num4 + num5 + num6;
	}
	
	public String getSerial() {
		return serialNumber;
	}
	
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num1;
	}
	
	public int getNum3() {
		return num1;
	}
	
	public int getNum4() {
		return num1;
	}
	
	public int getNum5() {
		return num1;
	}
	
	public int getNum6() {
		return num1;
	}
	
	public void setSerial(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public void setNum4(int num4) {
		this.num4 = num4;
	}

	public void setNum5(int num5) {
		this.num5 = num5;
	}
	
	public void setNum6(int num6) {
		this.num6 = num6;
	}

}
