package BasicsOfJava.SheriyansClass;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i, n = scan.nextInt();

        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
