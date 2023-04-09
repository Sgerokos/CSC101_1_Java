package BoxOrderCalculator;

import java.util.Scanner;

public class BoxOrderCalculator {
	
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    // Ask the user to enter the number of boxes they want to buy
	    System.out.println("Please Enter the Number of Boxes to Buy: ");
	    
	    // Accept the quantity
	    int quantity;
	    while (true) {
	        quantity = scanner.nextInt();
	        
	        // If greater than 200 then it will ask the user to enter a number under 200
	        if (quantity > 200) {
	            System.out.println("Please Enter Less than 200");
	        } else {
	            break;
	        }
	    }
	    
	    // Estimates the price
	    double amount = quantity * 1.50;
	    
	    System.out.println("Please Enter a Shipping Location:");
	    
	    // Accept the shipping location
	    String shipping = scanner.next();
	    
	    // If NY it will automatically add 8.75% for the taxes
	    if (shipping.equalsIgnoreCase("NY")) {
	        amount += amount * 0.0875;
	    }
	    
	    if (quantity > 50) {
	        amount -= amount * 0.2;
	    }
	    
	    System.out.println("What Type of Shipping Mode Would you Like? Please Enter Air or Ground : ");
	    
	    // Ask the user for Shipping mode
	    String shippingMode = scanner.next();
	    
	    // Estimating the price of the shipping mode
	    if (shippingMode.equalsIgnoreCase("Air")) {
	        amount += 50;
	    } else {
	        amount += 10;
	    }
	    
	    // Prints the result's
	    System.out.println("The Total Amount is: " + String.format("%.2f", amount));
	}
}
