package BasicsOfJava.ConditionalStatements.ForLoop;

import java.util.Scanner;

public class SumGreater100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (; ; ) {
            System.out.println("Enter a number :");
            sum += scan.nextInt();
            
            if (sum >= 100) {
                System.out.println("done :" + sum);
                break;
            }


        }


    }
}
