
import java.util.Arrays;
//TC Om+m SC O1

public class mergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        while (p2 >= 0 && p1 >= 0) {


            //if p2 content is big
            if (nums2[p2] > nums1[p1]) {
                nums1[i] = nums2[p2];
                p2--;
            } else {
                nums1[i] = nums1[p1];
                p1--;
            }
            i--;

        }
        while (p2 >= 0) {
            nums1[i] = nums2[p2];
            p2--;
            i--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
