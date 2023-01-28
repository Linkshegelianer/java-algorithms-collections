/* Implement the Circle class to describe circles. 
 * A circle has only one property - its radius. 
 * Implement the getArea() and getCircumference() methods, which return the area and perimeter of the circle. */
class Circle { 
	private double radius; // property to store the radius of the circle

	public Circle(double r) { // constructor to initialize the radius
		this.radius = r;
	}

	public double getArea() { 
		return Math.PI * Math.pow(radius, 2);
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
}
