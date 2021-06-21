	public class Triangle extends GeometricObject{
		double side1;
		double side2;
		double side3;

	public Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	public Triangle(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
		}

	public boolean setFilled(boolean filled) {
		return filled;	
	}

	public String setColor(String color) {
		return color;
	}

	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return true;
	}

	@Override
	public double getPerimiter() {
		return 0;
	}
}