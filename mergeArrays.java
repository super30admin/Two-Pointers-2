// Time Complexity : O(m +n), m and n are the length of nums1 and nums2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
 * Assign 2 pointer at the end of both of the arrays.
 * Check which value at the both pointer is bigger and add that to the end of nums1
 * Also check till num2 is not completely checked
 */
// Your code here along with comments explaining your approach

public class mergeArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // pointers
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;

        // run while till both the arrays have values
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        // check for the nums2 array till it is empty
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

}
