/*
 * this program displays all the multiples of 2, 3, and 7 within the range of 71 to 150:
 */

package w.questionfour;


public class Questionfour {

    public static void main(String[] args) {
      //prompt numbeers
        int startRange = 71;
        int endRange = 150;

        System.out.println("Multiples of 2, 3, and 7 within the range " + startRange + " to " + endRange + ":");

        for (int i = startRange; i <= endRange; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}







