package BasicsOfJava.SheriyansClass;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter second Number : ");
        int num2 = scan.nextInt();

        System.out.println("sum = " + (num1 + num2));

    }
}
