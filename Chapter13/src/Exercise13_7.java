/*
 * Name: Amanda Cauzza
 * Date: 6/18
 * 
 * 
 * Modify the Triangle class from Exercise 13-1 so that Triangle extends GeometricObject 
 * and implements Colorable. Implement howToColor to display the message "Color all three sides".
Create the Colorable, Triangle, and GeometricObject classes. Write a test program that creates an array 
of five GeometricObjects. For each object in the array, display its area and invoke 
its howToColor method if it is colorable.
 */


	public class Exercise13_7 {
		public static void main(String[] args) {
				//Write a test program that creates an array of five GeometricObjects
				GeometricObject[] triangles = {new Triangle(2, 3, 4), new Triangle(3, 4, 5), new Triangle(3, 3, 3), 
						new Triangle(2, 4, 6), new Triangle(3, 5, 7)
				};
				
				
				//For each object in the array, display its area and invoke its howToColor method if it is colorable
				for (int i = 0; i < triangles.length; i++) {
					if (triangles[i] instanceof Colorable)
						System.out.println("The Area of Triangle " + (i + 1) + " is " 
						+ triangles[i].getArea());
						System.out.println("How to color: \n" + ((Colorable)triangles[i]).howToColor() + "\n");
				}
		}
	}