package b07lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lab4.Point;

class RectangleTest {
	@Test
	public void testDistance() {
		Point p1 = new Point(0.0, 8.0);
		Point p2 = new Point(4.0, 5.0);
		assertEquals(5.0, p1.distance(p2));
	}
	@Test
	public void testHashCode() {
		Point p1 = new Point(6.0, 7.0);
		assertEquals(53, p1.hashCode());
	}
	@Test
	public void testEqualssameobject() {
		Point p1 = new Point(0.0, 3.0);
		assertTrue(p1.equals(p1));
	}
	@Test
	public void testEqualsnull() {
		Point p1 = new Point(3.0, 5.0);
		assertFalse(p1.equals(null));
	}
	@Test
	public void testEqualsclass() {
		Point p1 = new Point(4.0, 5.0);
		Integer p2 = 1;
		assertFalse(p1.equals(p2));
	}
	@Test
	public void testEqualsX() {
		Point p1 = new Point(5.0, 7.0);
		Point p2 = new Point(6.0, 7.0);
		assertFalse(p1.equals(p2));
	}
	@Test
	public void testEqualsY() {
		Point p1 = new Point(7.0, 9.0);
		Point p2 = new Point(7.0, 8.0);
		assertFalse(p1.equals(p2));
	}
	@Test
	public void testequalssamevaluedifferentobjects() {
		Point p1 = new Point(7.0, 9.0);
		Point p2 = new Point(7.0, 9.0);
		assertTrue(p1.equals(p2));
	}
	
	
	@Test
	public void testPerimeter() {
		Point A = new Point(2.0, 2.0);
		Point B = new Point(6.0, 4.0);
		Rectangle C = new Rectangle(A, B);
		assertEquals(12.0, C.Perimeter(), 1e-6);
	}

	@Test
	public void testArea() {
		Point A = new Point(3.0, 4.0);
		Point B = new Point (7.0, 7.0);
		Rectangle C = new Rectangle(A, B);
		assertEquals(12.0, C.Area(), 1e-6);
	}
	
	@Test
	public void testisSquare_true() {
		Point A = new Point(2.0, 2.0);
		Point B = new Point(4.0, 4.0);
		Rectangle C = new Rectangle(A, B);
		assertTrue(C.isSquare());
	}
	
	@Test
	public void testissquare_false() {
		Point A = new Point(2.0, 3.0);
		Point B = new Point(9.0, 9.0);
		Rectangle C = new Rectangle(A, B);
		assertFalse(C.isSquare());
	}
	@Test
	public void testissquare_switchpoints() {
		Point A = new Point(0.0, 0.0);
		Point B = new Point(5.0, 5.0);
		Rectangle C = new Rectangle(A, B);
		Rectangle D = new Rectangle(B, A);
		assertTrue(C.isSquare());
		assertTrue(D.isSquare());
	}
}
