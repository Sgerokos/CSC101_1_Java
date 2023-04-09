package InvestmentCalculator;

import java.util.Scanner;

public class InvestmentCalculator {

	public static void main(String[] args) {
		// Import scanner
		Scanner input = new Scanner(System.in);
		
		// Ask the user to input the investment amount
		System.out.print("Please Enter Investment Amount: ");
		double investmentAmount = input.nextDouble();
		
		// Ask the user to input Annual Interest Amount
		System.out.print("Please Enter Annual Interest Amount: ");
		double annualInterestRate = input.nextDouble();
		
		// Ask the user to input number of years of interest
		System.out.print("Please Enter Number of Years: ");
		int numberOfYears = input.nextInt();
		
		// Calculate the amount based off of interest and number of years
		double futureInvestmentValue = investmentAmount * Math.pow(1 + (annualInterestRate / 1200), numberOfYears * 12);
		
		// Print the value on screen for the user
		System.out.printf("The Accumulated Value is %.2f", futureInvestmentValue);
		
		// Close the scanner
		input.close();
	}

}

