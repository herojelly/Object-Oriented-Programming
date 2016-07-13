// Gregory Jerian
// Period 4
// Project 8.11

public class LinearEquation {
	private double a, b, c, d, e, f;
	
	LinearEquation(double A, double B, double C, double D, double E, double F) {
		a = A;
		b = B;
		c = C;
		d = D;
		e = E;
		f = F;
	}
	
	double getA() {
		return a;
	}
	
	double getB() {
		return b;
	}
	
	double getC() {
		return c;
	}
	
	double getD() {
		return d;
	}
	
	double getE() {
		return e;
	}
	
	double getF() {
		return f;
	}
	
	boolean isSolvable() {
		return a * d - b * c != 0;
	}
	
	double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}
	
	double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}
