package lab4;

public class Circle {
	Point center
	double radius;
	
	public Circle(Point center, double radius) {
		this.center
		this.radius = radius;
	}
	
	public double circumference() {
		return 2*Math.PI*radius;
	}
	
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public boolean pointInCircle(Point p) {
		return p.distance(center) <= radius;
	}
}
