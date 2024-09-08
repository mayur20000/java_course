package BasicsOfJava.TakingInput;
import java.util.Scanner;
public class IntInput {
    public static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you number");
        int num_1 = scan.nextInt();

        System.out.println("Number is " + num_1);
    }
}

