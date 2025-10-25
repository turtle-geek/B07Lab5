package b07lab5;
import java.lang.Math;

public class Rectangle {
	Point A;
	Point B;
	Point cornerR;
	Point cornerL;
	
	public Rectangle(Point A, Point B) {		
		Point O = new Point(0,0);
		if (A.distance(O)>B.distance(O)) {
			this.A = B;
			this.B = A;
		}
				
		this.A = A;
		this.B = B;
		cornerR = new Point(this.B.x, this.A.y);
		cornerL = new Point(this.A.x, this.B.y);
	}
	
	public double Perimeter() {
		return A.distance(cornerL)+cornerL.distance(B)+B.distance(cornerR)+cornerR.distance(A);
	}
	
	public double Area() {
		return A.distance(cornerL)*cornerL.distance(B);
	}
	
	public boolean isSquare() {
		double dACornerL = A.distance(cornerL);
		double dBCornerL = B.distance(cornerL);
		
		double epsilon = 1e-6;
		
		return (Math.abs(dACornerL-dBCornerL) <= epsilon);
	}
}
