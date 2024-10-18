package BasicsOfJava.Arrays;

public class SortedElement {
    public static void main(String[] args) {
        int arr[] = {2, 96, 85, 74, 95};

        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;

            }
        }
        System.out.println(isSorted ? "Sorted" : "not Sorted");
    }
}
