package BasicsOfJava.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int arr[] = {4, 5, 8, 4, 2};
        int n = arr.length - 1;
        int i = 0, j = n - i;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }

        for (int k = 0; k <= n; k++) {
            System.out.print(arr[k]);
        }

    }
}
