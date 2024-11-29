package BasicsOfJava.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;

            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;

        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Number of elements not equal to " + val1 + ": " + k1);
        System.out.print("Array with elements not equal to " + val1 + ": ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }

    }
}
