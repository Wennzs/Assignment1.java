/*
 * this program is meant to asks the user to enter their surname and current
 * age, and then prints the number of characters in their surname and whether their age is even or odd:
 */

package w.question0ne;

import java.util.Scanner;

public class Question0ne {

    public static void main(String[] args) {
   
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your surname: ");
            String surname = scanner.nextLine();
            
            System.out.print("Enter your current age: ");
            int age = scanner.nextInt();
            
            int surnameLength = surname.length();
            String ageStatus = (age % 2 == 0) ? "even" : "odd";
            
            System.out.println("The number of characters in your surname is " + surnameLength + ".");
            System.out.println("Your current age is an " + ageStatus + " number.");
        }
    }
}
