package BasicsOfJava.ConditionalStatements.SwitchCase;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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

            switch (temp) {
                case 2:
                    if (x == 2) count++;
                    break;
                case 3:
                    if (x == 3) count++;
                    break;
                // Add more cases if needed
                default:
                    if (temp == x) count++;
                    break;
            }
        }

        System.out.println("Count: " + count);
    }
}



























