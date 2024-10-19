package BasicsOfJava.Arrays;

public class SumOfElements {
    public static void main(String[] args) {

        int array[] = {5, 2, 4, 7, 8};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];

        }
        System.out.println("Sum is :" + sum);

    }
}
