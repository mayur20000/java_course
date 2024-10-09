package BasicsOfJava.ConditionalStatements.ForLoop;

import java.util.Scanner;

public class DecreasingEvenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i, n = scan.nextInt();

        for (i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);

            } else {
                System.out.println(i = i - 1);

            }

        }
    }
}
