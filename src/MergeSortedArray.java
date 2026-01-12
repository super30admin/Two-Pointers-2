/*
Problem - Merging of 2 arrays
Approach - We start filling nums1 from the back using two pointers from end of nums1's filled part and nums2.
At each step, we place the larger of the two elements at the end and move pointers backward.
After that, if anything is left in nums2, we copy it directly into nums1.

 */
import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;// starting from end of an array because if we start from the beginning of array we will encounter second array goes unsorted
        int index = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
            }
            else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }
        while (p2 >= 0) {
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
