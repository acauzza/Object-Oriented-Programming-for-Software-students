/*
 * (The Octagon class) Write a class named Octagon that extends GeometricObject and implements the Comparable and Cloneable
 *  interfaces. Assume that all eight sides of the octagon are of equal length.
The area can be computed using the following formula:
𝐴𝑟𝑒𝑎=(2+42√)∗𝑠𝑖𝑑𝑒∗𝑠𝑖𝑑𝑒

Create the Octagon and GeometricObject classes.

Write a test program that creates an Octagon object. Clone the first octagon into a second, then use the .compareTo method to compare the two objects
 */


public class Exercise13_11 {
	public static void main(String[] args) {
		// Create an Octagon object
		Octagon octagon1 = new Octagon(3);
		System.out.println("Creating Octagon...");

		// Create new object using the clone method
		Octagon octagon2 = (Octagon)octagon1.clone();
		System.out.println("Cloning Octagon...");
		
		

		// Compare the two object using compareTo method
		int octaComp = (octagon1.compareTo(octagon2));
		if (octaComp == 1)
			System.out.println("Octagon is greather than its clone.");
		else if (octaComp == -1)
			System.out.println("Octagon is less than its clone."); 
		else
			System.out.println("Octagon is equal to its clone.");
	}
}