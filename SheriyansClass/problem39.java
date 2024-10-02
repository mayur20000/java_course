package BasicsOfJava.SheriyansClass;

import java.util.Scanner;

public class problem39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = scan.nextInt();
        int cod = 0;
        int temp = n;
        while (n != 0) {
            cod++;
            n = n / 10;

        }
        n = temp;
        int sq = n * n;
        int lastDigit = sq % (int) (Math.pow(10, cod));
        System.out.println(lastDigit == n ? "Automotphic" : "Not Automorphic");
    }
}
