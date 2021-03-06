/**
 * 
 */
package shapes;

/**
 * 
 * Rectangle class that implements Shape interface and 
 * gets the area and perimeter
 * 
 * @author warddo
 *
 */
public class Rectangle implements Shape {
	
	private double width, length;

	/**
	 * Rectangle constructor taking in width and length
	 * 
	 * @param width
	 * @param length
	 */
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	/* (non-Javadoc)
	 * @see githooks.shapes.Shape#getArea()
	 */
	public double getArea() {
		// A = w * l
		return width * length;
	}
	
	/* (non-Javadoc)
	 * @see githooks.shapes.Shape#getPerimeter()
	 */
	public double getPerimeter() {
		// P = 2(w + l)
		return 2 * (width * length);
	}
	
	
}
