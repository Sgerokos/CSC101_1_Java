package GradeCalculator;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// Ask the user to input the name and grades of the student
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter The Student's Name Followed By The Grades: ");
		String grades = input.nextLine();
		input.close();
		
		// Splits the grades into a list
		String[] gradesList = grades.split(",");
		
		// Make sure the input is not exactly 6
		if (gradesList.length != 6) {
			System.out.println("Invalid Input!!!");
		} else {
			// Compute the grades
			int[] studentsGrades = new int[4];
			for (int i = 2; i < gradesList.length; i++) {
				studentsGrades[i - 2] = Integer.parseInt(gradesList[i]);
			}
			
			// Compute the sum of the grades
			int totalGrades = 0;
			for (int grade : studentsGrades) {
				totalGrades += grade;
			}
			
			// Compute the letter grade
			String letterGrade = "";
			if (totalGrades >= 90) {
				letterGrade = "A";
			} else if (totalGrades >= 80 && totalGrades <= 89) {
				letterGrade = "B";
			} else if (totalGrades >= 70 && totalGrades <= 79) {
				letterGrade = "C";
			} else if (totalGrades >= 60 && totalGrades <= 69) {
				letterGrade = "D";
			} else {
				letterGrade = "F";
			}
			
			// Print the student's name and the letter grade
			System.out.printf("%s,%s, %s%n", gradesList[0], gradesList[1], letterGrade);
		}
	}

}

