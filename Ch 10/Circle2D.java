// Gregory Jerian
// Period 4
// Project 10.11

public class Circle2D {
	private double x, y, radius;
	
	Circle2D() {
		radius = 1;
	}
	
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	boolean contains(double x, double y) {
		double distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
		return distance <= radius;
	}
	
	boolean contains(Circle2D circle) {
		double distance = Math.sqrt(Math.pow((circle.x - x), 2) + Math.pow((circle.y - y), 2));
		double remainingDistance = radius - distance;
		return circle.radius <= remainingDistance;
	}
	
	boolean overlaps(Circle2D circle) {
		double distance = Math.sqrt(Math.pow((circle.x - x), 2) + Math.pow((circle.y - y), 2));
		return distance <= circle.radius + radius;
	}
	
}
