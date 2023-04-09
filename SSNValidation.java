package SSNValidation;

import java.util.Scanner;

public class SSNValidation {

	public static void main(String[] args) {
		
		// Ask the user to enter a social security number
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter a Social Security Number: ");
		String ssn = input.nextLine();
		
		// Variable to verify the number
		boolean valid = true;
		
		if (ssn.length() != 11) {
			// If length is not 11 it will return false
			valid = false;
		} else if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
			// If the dashes are not at correct places return false
			valid = false;
		} else if (!ssn.substring(0, 3).matches("[0-9]+") || !ssn.substring(4, 6).matches("[0-9]+") || !ssn.substring(7).matches("[0-9]+")) {
			// If the numeric parts do not consists of numbers return false
			valid = false;
		}
		
		if (valid) {
			System.out.println("Valid SSN");
		} else {
			System.out.println("Invalid SSN");
		}
		
		input.close();
	}
}
