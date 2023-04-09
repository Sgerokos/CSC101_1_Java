package PasswordChecker;

import java.util.Scanner;

public class PasswordChecker {

    // define the checkPassword method
    private static boolean checkPassword(String password) {
        int countLtr = 0;
        int countDgt = 0;
        for (char ch : password.toCharArray()) {
            // if the character is a digit, increase the digit count
            if (Character.isDigit(ch)) {
                countDgt++;
            }
            // if it is alphabetic, increase the letter count
            else if (Character.isLetter(ch)) {
                countLtr++;
            }
            // if it is anything else, return false
            else {
                return false;
            }
        }
        // check if digits are at least 2 and count of letter and digit are at least 8
        return (countDgt >= 2 && countLtr + countDgt >= 8);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask the user to input password
        System.out.print("Please Enter Your Password: ");
        String pwd = input.nextLine();
        input.close();
        if (checkPassword(pwd)) {
            // Print "Valid Password" if the password is valid, "Invalid Password" otherwise
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}