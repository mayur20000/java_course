package BasicsOfJava.Arrays;

public class LargestElement {
    public static void main(String[] args) {

        int arr[] = {12, 56, 75, 45, 5, 7};
        int largest = 12;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }


        }
        System.out.println(largest);
    }
}
