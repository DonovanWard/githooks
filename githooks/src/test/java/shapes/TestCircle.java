package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;

public class TestCircle {

	@Test
	public void testCircle() {
		System.out.println("testCircle");
		Circle circle = new Circle(2.5);
		assertNotNull(circle);
		assertEquals(Circle.class, circle.getClass());
		System.out.println("Area of circle: " + circle.getArea());
		assertEquals(19.634954084936208, circle.getArea(), 0);
		System.out.println("Perimeter of circle: " + circle.getPerimeter());
		assertEquals(15.707963267948966, circle.getPerimeter(), 0);
		System.out.println();
	}

}
