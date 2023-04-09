package InteractiveShoppingList;

import java.util.ArrayList;
import java.util.Scanner;

public class InteractiveShoppingList {

	public static void main(String[] args) {

	    // Create an empty list
	    ArrayList<String> myList = new ArrayList<>();

	    // Ask the user for their input
	    Scanner input = new Scanner(System.in);
	    System.out.print("\nMenu: A)dd, R)emove, F)ind, P)rint, Q)uite: ");
	    String user_input = input.nextLine();

	    // Sentinel controlled loop
	    while (!user_input.equals("Q")) {

	        // Add item to the list
	        if (user_input.equals("A")) {
	            System.out.print("Please Enter The Item To Add To The List: ");
	            String item = input.nextLine();
	            myList.add(item);

	            // Remove item from the list
	        } else if (user_input.equals("R")) {
	            System.out.print("Please Enter The Item To Remove From The List: ");
	            String item = input.nextLine();
	            if (myList.remove(item)) {
	                System.out.println("Item Removed From The List.");
	            } else {
	                System.out.println(item + " Is Not On The List.");
	            }

	            // Find items on the list for the user
	        } else if (user_input.equals("F")) {
	            System.out.print("What Item Would You Like To Find In The List: ");
	            String item = input.nextLine();
	            int count = 0;
	            for (int i = 0; i < myList.size(); i++) {
	                if (myList.get(i).equals(item)) {
	                    System.out.println(item + " Found On The List At Index " + i);
	                    count++;
	                }
	            }
	            if (count == 0) {
	                System.out.println(item + " Is Not On The List.");
	            }

	            // Print the list's elements
	        } else if (user_input.equals("P")) {
	            System.out.println("List Of The Items");
	            for (int i = 0; i < myList.size(); i++) {
	                System.out.println((i + 1) + ". " + myList.get(i));
	            }

	            // If the user types an invalid input they will get a message invalid input
	        } else {
	            System.out.println("Invalid Input Please Try Again");
	        }

	        // Continues to take the user's input and continues the loop
	        System.out.print("\nMenu: A)dd, R)emove, F)ind, P)rint, Q)uite: ");
	        user_input = input.nextLine();
	    }

	    // Prints a thank you message and exits
	    System.out.println("Thank You Come Again!!!");
	    input.close();
	}
}
