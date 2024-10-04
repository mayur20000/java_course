package BasicsOfJava.SheriyansClass;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = scan.nextInt();
        System.out.println("Enter Second number : ");
        int b = scan.nextInt();
        int max = a;
        if (max > b) {
            System.out.println("A is grater than B : ");
        } else {
            System.out.println("B is greater than A : ");

        }
    }
}
