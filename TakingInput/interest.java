package BasicsOfJava.TakingInput;
import java.util.Scanner;
public class interest {
    public static void main() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Principal :");
        float principal = scan.nextFloat();

        System.out.println("Enter Rate:" );
        float rate = scan.nextFloat();

        System.out.println("Enter time :");
        int time = scan.nextInt();

        System.out.println("Principal is : " + principal);
        System.out.println("Rate is " +rate);
        System.out.println("Inter is " + time) ;


        System.out.println("principal is = " +principal);
        System.out.println("Rate is = " + rate);
        System.out.println("Time is = " + time);
        float SimpleInterest = scan.nextFloat();
        System.out.println("Simple Interest is  = "+ SimpleInterest);



    }

}
