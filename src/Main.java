import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String response = "";
        String output;

        do {
            System.out.print("Enter a number: ");
            int input = keyboard.nextInt();

            for (int index = input; index >= 1; index--) {

				//=================================
				// Method 1
				
//                output = "";
//
//                if (index % 7 == 0) {
//                    output += "Copy";
//                }
//
//                if(index % 5 == 0){
//                    output += "Cat";
//                }
//
//                if(!output.equals("")){
//                    System.out.println(output);
//                }
//                else {
//                    System.out.println(index);
//                }
				//=================================


				//=================================
				// Method 2
				
                if(index%7 == 0 && index%5 == 0){
                    System.out.println("CopyCat");
                }
                else if(index%7 == 0){
                    System.out.println("Copy");
                }
                else if(index%5 == 0){
                    System.out.println("Cat");
                }
                else {
                    System.out.println(index);
                }
				//=================================
            }

            System.out.print("Would you like to enter another number (y/n)");
            response = keyboard.next();

            // Loop continues if user enters in yes or y
        } while(response.equalsIgnoreCase("y") || response.equalsIgnoreCase(
                "yes"));

        System.out.println("Thank you for playing!");



    }
}
