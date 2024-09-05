package BasicsOfJava.TakingInput;
import java.util.Scanner;
public class SumOfTwo {
    public static void main(String[] args) {

        Scanner add = new Scanner(System.in);
        System.out.println("Enter first number :" );
        int num_1 = add.nextInt();

        System.out.println("Enter Second Number :" );
        int num_2 = add.nextInt();

        int sum = num_1 + num_2;

        System.out.println("Sum is : " +sum);



    }
}
