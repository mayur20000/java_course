package BasicsOfJava.Arrays;

public class SecLargest {
    public static void main(String[] args) {

        int number[] = {1, 2, 3, 4, 5, 6};
        int largest = Integer.MIN_VALUE;
        int secondLargest = -1;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                secondLargest = largest;
                largest = number[i];
            } else if (number[i] > secondLargest && number[i] != largest) {
                secondLargest = number[i];

            }

        }
        System.out.println("The second largest Element is : " + secondLargest);
    }
}
