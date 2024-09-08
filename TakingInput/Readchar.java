package BasicsOfJava.TakingInput;
import java.util.Scanner;
public class Readchar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter a word : ");
        char ch = read.next().charAt(4);
        System.out.println("Charater is : " +ch);
    }
}
