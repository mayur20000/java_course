package BasicsOfJava.SheriyansClass;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first No. : ");
        int a = scan.nextInt();
        System.out.println("Enter second No. : ");
        int b = scan.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + "," + "b = " + b);
    }
}
