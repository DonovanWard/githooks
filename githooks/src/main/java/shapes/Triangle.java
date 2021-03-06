package shapes;

/**
 * 
 * Triangle class that implements Shape interface and 
 * gets the area and perimeter
 * 
 * @author warddo
 *
 */
public class Triangle implements Shape {
	
	private double a, b, c;

	/**
	 * Triangle constructor taking in three sides
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/* (non-Javadoc)
	 * @see githooks.shapes.Shape#getArea()
	 */
	public double getArea() {
		/* Heron's formula:
         * A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
         * where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle
		 */
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	/* (non-Javadoc)
	 * @see githooks.shapes.Shape#getPerimeter()
	 */
	public double getPerimeter() {
		// P = a + b + c
		return a + b + c;
	}
}
