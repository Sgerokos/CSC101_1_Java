package FrequencyCounter;

import java.util.Scanner;

public class FrequencyCounter {

    public static void main(String[] args) {

        // Asks the user to input a number from 1 to 100, then splits the number
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter integers between 1 and 100: ");
        String inputString = input.nextLine();
        String[] numbers = inputString.split(" ");

        // Converts the strings into integers and stores them in an array
        int[] n = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            n[i] = Integer.parseInt(numbers[i]);
        }

        // Creates an array of 100 numbers with 0
        int[] c = new int[100];

        // Counts the appearance of each number in the list
        for (int i = 0; i < n.length; i++) {
            c[n[i] - 1]++;
        }

        // Displays the appearance of each number
        for (int i = 0; i < c.length; i++) {
            if (c[i] > 0) {
                if (c[i] == 1) {
                    System.out.println((i + 1) + " appears 1 time");
                } else {
                    System.out.println((i + 1) + " appears " + c[i] + " times");
                }
            }
        }
    }
}

