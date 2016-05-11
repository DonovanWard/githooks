/**
 * 
 */
package shapes;

/**
 * 
 * Circle class that implements Shape interface and 
 * gets the area and perimeter
 * 
 * @author warddo
 *
 */
public class Circle implements Shape {
	
	private double radius;
	private double pi = Math.PI;
	
	/**
	 * Circle constructor taking in radius
	 * 
	 * @param radius
	 */
	public Circle(double radius) {
        this.radius = radius;
    }

	/* (non-Javadoc)
	 * @see githooks.shapes.Shape#getArea()
	 */
	public double getArea() {
		// A = π r^2
		return pi * Math.pow(radius, 2);
	}

	/* (non-Javadoc)
	 * @see githooks.shapes.Shape#getPerimeter()
	 */
	public double getPerimeter() {
		// P = 2πr
        return 2 * pi * radius;
	}

}
