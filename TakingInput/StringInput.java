package BasicsOfJava.TakingInput;

import java.util.Scanner;

public class StringInput {
    public static void main() {

        Scanner scan = new Scanner(System.in);  // scan is object name, System.in is to take input
        System.out.println("Enter you Name");
        String name = scan.next();            // scan is object and .next is meathod to take input but it will display for first word
        System.out.println("Name is: " + name);

    }
}
