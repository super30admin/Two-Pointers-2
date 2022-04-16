import java.util.Arrays;
//Time Complexity O(n)
// Space Complexity O(1)

public class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null) return;
        int r1 = m - 1;
        int r2 = n - 1;
        int r3 = m + n - 1;

        while (r1 >= 0 && r2 >= 0) {
            if (nums1[r1] > nums2[r2]) {
                nums1[r3] = nums1[r1];
                r1--;
            } else {
                nums1[r3] = nums2[r2];
                r2--;
            }
            r3--;
        }
        while (r2 >= 0) {
            nums1[r3] = nums2[r2];
            r2--;
            r3--;
        }
        System.out.println("Final value " + Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        problem2.merge(nums1, 3, nums2, 3);
//        System.out.println("Final value " + Arrays.toString(result));
    }

}
