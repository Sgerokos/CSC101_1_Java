package PhoneNumberConverter;

import java.util.Scanner;

public class PhoneNumberConverter {

	// Returns the number associated with an alphabet
	public static int getNum(char uppercaseLetter) {
		char[][] numMap = {{'A','B','C'}, {'D','E','F'}, {'G','H','I'}, {'J','K','L'}, 
			{'M','N','O'}, {'P','Q','R','S'}, {'T','U','V'}, {'W','X','Y','Z'}};
		
		// Iterates through each inner array
		for (int i = 0; i < numMap.length; i++) {
			// Iterates through each alphabet in the inner array
			for (int j = 0; j < numMap[i].length; j++) {
				// Checks if alphabet is equal to the alphabet passed
				if (numMap[i][j] == Character.toUpperCase(uppercaseLetter)) {
					// Returns the associated number
					return i + 2;
				}
			}
		}
		
		// Returns -1 if character is not a letter
		return -1;
	}

	// Gets the new phone number
	public static String letterToNum(String word) {
		String pNum = "";
		// Iterates through each character in the word
		for (char c : word.toCharArray()) {
			// Gets number associated with the letter
			int num = getNum(c);
			if (num != -1) {
				pNum += num;
			}
		}
		return pNum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Asks the user to input a phone number with or without dashes
		System.out.print("Please Enter a Phone Number With or Without Dashes: ");
		String phoneNum = input.nextLine();
		
		// Looks to see if it contains the dash symbol
		if (phoneNum.contains("-")) {
			String[] splitNum = phoneNum.split("-");
			if (splitNum.length == 3) {
				System.out.printf("%s-%s-%s%n", splitNum[0], splitNum[1], letterToNum(splitNum[2]));
			}
		} else {
			// Looks to see if it is with or without dashes
			if (phoneNum.length() == 10) {
				System.out.printf("(%s) %s-%s%n", phoneNum.substring(0, 3), 
					phoneNum.substring(3, 6), phoneNum.substring(6));
			} else if (phoneNum.length() == 7) {
				System.out.printf("%s-%s%n", phoneNum.substring(0, 3), phoneNum.substring(3));
			}
		}
		
		input.close();
	}
}
