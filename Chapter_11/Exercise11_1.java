/*
Name: Amanda Cauzza
Date: 5/24



Triangle

side1: double
side2: double
side3: double

Triangle()
Triangle(side1: double, side2: double, side3: double)
getSide1(): double
getSide2(): double
getSide3(): double
getArea(): double
getPerimeter(): double
toString(): String
*/


import java.util.Date;
import java.util.Scanner;
import java.awt.geom.*;

public class Exercise11_1 {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);


			System.out.print("Enter three side of the triangle: ");
			double side1 = input.nextDouble();		
			double side2 = input.nextDouble();		
			double side3 = input.nextDouble();


			System.out.print("Enter a color: ");
			String color = input.next();


			System.out.print("Is the triangle filled (true / false)? ");
			boolean filled = input.nextBoolean();


			Triangle triangle = new Triangle(side1, side2, side3);
			triangle.setColor(color);
			triangle.setFilled(filled);

			System.out.println(triangle.toString());
			System.out.println("Area: " + triangle.getArea());
			System.out.println("Perimeter: " + triangle.getPerimeter());
			System.out.println("Color: " + triangle.getColor());
			System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
				+ "filled");
			}
		}
	
	
	

