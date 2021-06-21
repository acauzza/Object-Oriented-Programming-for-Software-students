/*
 * Name: Amanda Cauzza
 * Date: 6/21
 */

public class Octagon extends GeometricObject 
		implements Cloneable, Comparable<Octagon> {
	private double side;

	public Octagon() {
	}

	public Octagon(double side) {
		this.side = side;
	}

	//Implement setters and getters
	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	// Return the area of this Octagon
	@Override 
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	

	@Override //Implement compareTo method
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override 
	public String toString() {
		return super.toString() + "\nArea: " + getArea();
	}

	@Override 
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	
}