package BasicsOfJava.SheriyansClass;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isPerfect = false;
        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n) ;
            isPerfect = true;
            break;

        }
        System.out.println(isPerfect ? "Perfect Square" : "Not perfect square");

    }
}
