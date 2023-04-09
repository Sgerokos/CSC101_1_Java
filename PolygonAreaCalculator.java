package PolygonAreaCalculator;

import java.util.Scanner;
import java.lang.Math;

public class PolygonAreaCalculator {

	public static void main(String[] args) {
	    
	    // Ask the user for the number of sides
	    Scanner input = new Scanner(System.in);
	    System.out.print("Please Enter the Number of Sides: ");
	    int numSides = input.nextInt();
	    
	    // Ask the user for the length of the sides
	    System.out.print("Please Enter the Length of the Sides: ");
	    double sideLength = input.nextDouble();
	    input.close();
	    
	    // Calculate the area using the number and side lengths
	    double area = numSides * sideLength * sideLength / Math.tan(Math.PI / numSides) / 4;
	    
	    // Print the area on screen for the user
	    System.out.println("The Area of the Polygon is " + area);
	}
}
