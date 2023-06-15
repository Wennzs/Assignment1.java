/*
 * this program acts as a basic calculator, allowing the user to perform addition, multiplication,subtraction,  and division operations:
*/

package w.questionfive;

import java.util.Scanner;

public class Questionfive {

    public static void main(String[] args) {
      
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();
            
            System.out.print("Enter the operation (+, -, *, /): ");
            String operation = scanner.next();
            
            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();
            
            double result = 0;
            
            switch (operation) {
                case "+" -> result = number1 + number2;
                case "-" -> result = number1 - number2;
                case "*" -> result = number1 * number2;
                case "/" -> result = number1 / number2;
                default -> {
                    System.out.println("Invalid operation!");
                    System.exit(0);
                }
            }
            
            System.out.println("Result: " + result);
        }
    }
}


