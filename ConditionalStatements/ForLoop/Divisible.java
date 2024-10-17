package BasicsOfJava.ConditionalStatements.ForLoop;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input for number 'n' and 'x'
        int n = scan.nextInt();
        int x = scan.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            int temp = 1;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    temp++;
                }
            }
            if (x == temp) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
