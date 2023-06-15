/*
 * this program helps kids learn divisibility tests for numbers from 0 to 9:
 */

package w.questionthree;

import java.util.Scanner;
public class Questionthree {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            
            boolean divisible = false;
            
            // Check divisibility by integers in the range of 0-9
            for (int i = 0; i <= 9; i++) {
                if (i != 0 && number % i == 0) {
                    divisible = true;
                    System.out.println("The number is divisible by " + i);
                }
            }
            
            if (!divisible) {
                System.out.println("The number is not divisible by any integer in the range of 0-9");
            }
        }
    }
}
    

