package ArithmeticQuizMaster;

import java.util.Scanner;
import java.util.Random;

public class ArithmeticQuizMaster {

    public static void main(String[] args) {
        
        // Count's the number of correct answers
        int correctAnswer = 0;
        
        // Count's the number of incorrect answers
        int incorrectAnswer = 0;
        
        // Check's the consistency of incorrect answer
        int incorrectCurrentStreak = 0;
        
        // The longest streak of correct answer
        int longestCorrectStreak = 0;
        
        // The current streak of correct answer's
        int currentCorrectStreak = 0;
        
        // Start's the quiz
        long startTime = System.currentTimeMillis();
        
        // The input from the user for the answer
        int answer;
        
        // Check's to see if the answer is correct
        boolean isCorrect;
        
        //while loop for subtracting 1 point for each wrong answer
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        while (true) {
            
            // Check's to see if an incorrect answer was given 3 time's 
            if (incorrectCurrentStreak != 3) {
                
                // Generate's two random integers
                int number1 = rand.nextInt(10);
                int number2 = rand.nextInt(10);
                
                // If number1 is less than number2, swap number1 with number2 
                if (number1 < number2) {
                    int temp = number1;
                    number1 = number2;
                    number2 = temp;
                }
                
                // Prompt the student to answer "What is number1 - number2?" 
                System.out.print("What is " + number1 + " - " + number2 + "? ");
                answer = scanner.nextInt();
                
                // Grade's the answer and display the result for the user
                if (number1 - number2 == answer) {
                    System.out.println("Your answer is correct!");
                    
                    // Add's plus one for a correct answer
                    correctAnswer++;
                    isCorrect = true;
                    
                } else {
                    System.out.println("Your answer is incorrect.\n" + number1 + " - " + number2 + " is " + (number1 - number2));
                    
                    // Add's plus one for a incorrect answer
                    incorrectAnswer++;
                    isCorrect = false;
                }
                
                // If current answer is true  
                if (isCorrect) {
                    
                    // Add's plus one for a correct streak
                    currentCorrectStreak++;
                    incorrectCurrentStreak = 0;
                    
                    // This check's if currentCorrectStreak is greater than the longest correctAnswer streak 
                    if (currentCorrectStreak > longestCorrectStreak) {
                        longestCorrectStreak = currentCorrectStreak;
                    }
                    
                //if current answer is False  
                } else {
                    
                    // Add's plus one to incorrect streak
                    incorrectCurrentStreak++;
                    currentCorrectStreak = 0;
                }
                
            // If the incorrect Streak becomes 3   
            } else {
                
                // Break's out of the while loop
                break;
            }
        }
        
        // Get's the end time and test time
        long endTime = System.currentTimeMillis();
        int testTime = (int) (endTime - startTime) / 1000;
        
        // Calculate's the total score
        int totalScore = correctAnswer + (longestCorrectStreak * 10);
        
        // Print's result's for the user
        System.out.println("The Total Score is " + totalScore + "\nTotal Correct Answer's is = " + correctAnswer
        		+ "\nThe Total Incorrect Answer's is = " + incorrectAnswer
        		+ "\nTime The Duration of Test is " + testTime + " seconds");
        
	}
}