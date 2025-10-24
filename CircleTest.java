package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testCircumference() {
		Point p1 = new Point(0.0, 0.0);
		Circle c1 = new Circle(p1, 1);
		assertEquals(c1.circumference(), 2*Math.PI);
	}
	
	@Test
	void testArea() {
		Point p1 = new Point(0.0, 0.0);
		Circle c1 = new Circle(p1, 1);
		assertEquals(c1.area(), Math.PI);
	}
    
	@Test
	void testPointInCircle1() {
		Point p1 = new Point(0.0, 0.0);
		Circle c1 = new Circle(p1, 1);
		Point p2 = new Point(0.5, 0.5);
		assertTrue(c1.pointInCircle(p2));
	}
	
	@Test
	void testPointInCircle2() {
		Point p1 = new Point(0.0, 0.0);
		Circle c1 = new Circle(p1, 1);
		Point p2 = new Point(1.0, 1.0);
		assertFalse(c1.pointInCircle(p2));
	}
}