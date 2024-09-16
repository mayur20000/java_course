package BasicsOfJava.TakingInput;

import java.util.Scanner;

public class Scn {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = scan.nextInt();
        System.out.println("Number is : " + num);

    }
}
