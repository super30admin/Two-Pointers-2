
import java.util.Arrays;

public class Merge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = m + n - 1;
        int p3 = n - 1;
        while (p3 >= 0 && p1 >= 0) {
            if (nums1[p1] > nums2[p3]) {
                nums1[p2] = nums1[p1];
                p2--;
                p1--;
            } else if (nums1[p1] <= nums2[p3]) {
                nums1[p2] = nums2[p3];
                p3--;
                p2--;
            }
        }
        while (p3 >= 0) {
            nums1[p2] = nums2[p3];
            p2--;
            p3--;
        }

    }

    public static void main(String[] args) {
        Merge m = new Merge();
        int[] nums1 = new int[0];
        int[] nums2 = { 1 };
        m.merge(nums1, 0, nums2, 1);
        System.out.println((Arrays.toString(nums1)));
    }
}
