package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;

public class TestRectangle {

	@Test
	public void testRectangle() {
		System.out.println("testRectangle");
		Rectangle rectangle = new Rectangle(2, 5);
		assertNotNull(rectangle);
		assertEquals(Rectangle.class, rectangle.getClass());
		System.out.println("Area of rectangle: " + rectangle.getArea());
		assertEquals(10, rectangle.getArea(), 0);
		System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
		assertEquals(20, rectangle.getPerimeter(), 0);
		System.out.println();
	}

}
