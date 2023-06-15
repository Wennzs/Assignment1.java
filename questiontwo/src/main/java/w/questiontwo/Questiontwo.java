/*
 * this program is create to ask a student to enter their marks in five units 
 * then compute the average  
 */

package w.questiontwo;

import java.util.Scanner;

public class Questiontwo {

    public static void main(String[] args) {
       
        int numberOfUnits = 5;
        double totalMarks = 0;

        try (java.util.Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the marks for each unit:");
            
            for (int i = 1; i <= numberOfUnits; i++) {
                System.out.print("Unit " + i + ": ");
                double marks = scanner.nextDouble();
                totalMarks += marks;
            }
            
            double average = totalMarks / numberOfUnits;
            
            System.out.printf("Average marks: %.2f%n", average);
        }
    }
}

        
    

