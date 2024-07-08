import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Example 1
        int n = 5;

        for (int i = 1; i <= n; ++i){
            System.out.println("Welcome to the Bronx");
        }


        //Example 2
        int sum = 0;
        int m = 1000;

        for (int i = 1; i <= m; ++i){
            sum += i;
        }
        System.out.println("Sum = " + sum);





        // Examole 3
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");

            original = in.nextLine();
            int length = original.length();
            for (int ii = length - 1; ii >= 0; ii--){
                reverse = reverse + original.charAt(ii);
                if(original.equals(reverse)){
                    System.out.println("The Entered string/number is a plaindrome.");
                } else {
                    System.out.println("The Entered string/number isn't a palindrome.");
                }
            }


            //Example 4

        for (int x=1; x<=5; x++){
            for (int y =1; y <= x; y++){
                System.out.print("$ ");
            }
            System.out.println();
 }

    }
}