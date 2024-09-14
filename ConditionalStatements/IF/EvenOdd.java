package BasicsOfJava.ConditionalStatements.IF;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number you have enetered is Even");
        }

    }
}
