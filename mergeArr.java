// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * Increase numbers from the nums2 arr into nums1 arr where there a zero placeholder.
 * We have to handle the cases where nums2 elements are smaller, so the elements are replaced from the right.
 * Reason: there is certainty that the elements on right are already accounted for in a sorted array.
 */

public class mergeArr{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int index = m + n - 1;
        if (n == 0) return;
        if (m == 0) {
            while (n-1 >= 0) {
                nums1[n-1] =  nums2[n-1];
                n = n-1;
            }
            return;
        }
        while(m-1 >= 0 && n-1 >= 0) {
            index = m + n - 1;
            if (nums1[m-1] >= nums2[n-1]) {
                nums1[index] = nums1[m-1];
                m -= 1;
            }
            else {
                nums1[index] = nums2[n-1];
                n -= 1;
            }
        }
        while (n-1 >= 0) {
            nums1[n-1] = nums2[n-1];
            n -= 1;
        }

    }
}