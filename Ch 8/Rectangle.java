// Gregory Jerian
// Period 4
// Project 8.1

public class Rectangle {
	private double width = 1;
	private double height = 1;
	
	Rectangle() {
	}
	
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	double getHeight() {
		return height;
	}
	
	double getWidth() {
		return width;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * (width + height);
	}
	
	void setWidth(double newWidth) {
		width = newWidth;
	}
	
	void setHeight(double newHeight) {
		height = newHeight;
	}

}
