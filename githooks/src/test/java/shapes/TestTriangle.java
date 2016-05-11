package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;

public class TestTriangle {

	@Test
	public void testTriangle() {
		System.out.println("testTriangle");
		Triangle triangle = new Triangle(3, 5, 3);
		assertNotNull(triangle);
		assertEquals(Triangle.class, triangle.getClass());
		System.out.println("Area of triangle: " + triangle.getArea());
		assertEquals(4.14578098794425, triangle.getArea(), 0);
		System.out.println("Perimeter of triangle: " + triangle.getPerimeter());
		assertEquals(11, triangle.getPerimeter(), 0);
		System.out.println();
	}

}
