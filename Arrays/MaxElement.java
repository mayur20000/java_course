package BasicsOfJava.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int array[] = {2, 5, 4, 7, 9};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }

        }
        System.out.println("Maximum element is : " + max);
    }
}
