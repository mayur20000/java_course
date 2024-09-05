package BasicsOfJava;
import java.util.Scanner;

public class StringInputSentence {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);

        System.out.println("Enter Your name :" );
        String name = word.nextLine();
        System.out.println("Entered name is : "  +name);
    }
}
