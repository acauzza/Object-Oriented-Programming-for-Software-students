/*
Name: Amanda Cauzza
Date: 5/21
*/

public class Exercise9_1 {
public static void main(String[] args) {

	Rectangle rectangle1 = new Rectangle(4, 40);

	Rectangle rectangle2 = new Rectangle(3.5, 35.9);
	
	System.out.println("\nRectangle 1");
	System.out.println("Width:     " + rectangle1.width);
	System.out.println("Height:    " + rectangle1.height);
	System.out.println("Area:      " + rectangle1.getArea());
	System.out.println("Perimeter: " + rectangle1.getPerimeter());

	// Display the width, height, area, and perimeter of rectangle2
	System.out.println("\nRectangle 2");
	System.out.println("Width:     " + rectangle2.width);
	System.out.println("Height:    " + rectangle2.height);
	System.out.println("Area:      " + rectangle2.getArea());
	System.out.println("Perimeter: " + rectangle2.getPerimeter());
	}
}

	class Rectangle {
		double width;
		double height;
		
		Rectangle() {
			width = 1;
			height = 1;
	}

		Rectangle(double newWidth, double newHeight) {
			width = newWidth;
			height = newHeight;
		}

	double getArea() {
		return width * height;
		}

	double getPerimeter() {
		return (2 * (width + height));
	}
	
}