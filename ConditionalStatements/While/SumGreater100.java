package BasicsOfJava.ConditionalStatements.While;

import java.util.Scanner;

public class SumGreater100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number : ");
            sum += scan.nextInt();

            if (sum >= 100) {
                break;
            }

        }
        System.out.println("Done :" + sum);
    }

}
