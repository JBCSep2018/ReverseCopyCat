import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String response = "";

        do {
            System.out.println("Enter a number: ");
            int input = keyboard.nextInt();

            for (int index = input; index >= 1; index--) {
                // Get multiples of 7 and 5, no remainder
                if (index % 7 == 0 || index % 5 == 0) {
                    System.out.println(index);
                }
            }

            System.out.println("Would you like to enter another number (y/n)");
            response = keyboard.next();

            // Loop continues if user enters in yes or y
        } while(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing!");



    }
}
