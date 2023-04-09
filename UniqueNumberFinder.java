package UniqueNumberFinder;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueNumberFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 10 numbers: ");
		String numString = input.nextLine();
		input.close();
		
		String[] nums = numString.split(" ");
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (String num : nums) {
			numList.add(Integer.parseInt(num));
		}
		
		// Create a new list without duplicates
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (Integer num : numList) {
			if (!newList.contains(num)) {
				newList.add(num);
			}
		}
		
		// Display the numbers in the list
		System.out.print("The numbers are: ");
		for (Integer num : newList) {
			System.out.print(num + " ");
		}
	}
}
