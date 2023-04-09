package FindHighestScores;

import java.util.Scanner;

public class FindHighestScores {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the number of students
        System.out.print("Please Enter the Number of Students: ");
        int num = input.nextInt();
        
        int first = 0;
        int second = 0;
        
        for (int i = 0; i < num; i++) {
            // Ask the user for the score of the student
            System.out.print("Please Enter the Student's Scores: ");
            int score = input.nextInt();
            
            // Compare the current score with the first and second scores
            if (score > first) {
                // New highest score
                second = first;
                // Last highest score becomes second
                first = score;
            } else if (score <= first && score > second) {
                // New second highest score
                second = score;
            }
        }
        
        // Display the highest and second highest scores to the user
        System.out.println("The Highest Score is " + first);
        System.out.println("The Second Highest Score is " + second);
        
        input.close();
    }
}