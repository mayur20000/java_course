package BasicsOfJava.ConditionalStatements.IF;

public class Max {
    public static void main(String[] args) {
        int num1 = 4, num2 = 5, num3 = 6;
        int max = num1;
        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }
        System.out.println("Maxmimum number is : " + max);
    }
}
