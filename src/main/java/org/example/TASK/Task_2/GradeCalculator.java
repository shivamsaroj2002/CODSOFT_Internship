package org.example.TASK.Task_2;
import java.util.Scanner;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
       calculate();
    }
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for each subject (out of 100):");
        System.out.print("Math: ");
        int mathMarks = scanner.nextInt();
        System.out.print("Science: ");
        int scienceMarks = scanner.nextInt();
        System.out.print("English: ");
        int englishMarks = scanner.nextInt();
        int totalMarks = mathMarks + scienceMarks + englishMarks;

        int numberOfSubjects = 3;
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Again?(y/n): ");
        char again = scanner.next().charAt(0);
        if(again == 'y') calculate();
        else System.out.println("Closing app...See you !");
        scanner.close();
    }
}

