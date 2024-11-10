package BasicsOfJava.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        int first = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[n - 1] = first;

        System.out.println("Left rotated array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
