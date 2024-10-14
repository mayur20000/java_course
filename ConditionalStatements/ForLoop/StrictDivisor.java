package BasicsOfJava.ConditionalStatements.ForLoop;

import java.util.Scanner;

public class StrictDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int sum = 0;
        int n = scan.nextInt();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += 1;
                System.out.println(sum);
            }

        }

    }

}
