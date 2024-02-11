// Time Complexity : O(m + n) [m = nums1.length - nums2.length; n = nums2.length]
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * Since arrray's are sorted, I've started from the backwards side to do comparison
 * Since last pos of subraay of num1 till m -1 and and last pos of array num2 can be comapred 
 * which ever is bigger by placing them in the last position of array nums1 which is held by ptr IDX
 */

// Your code here along with comments explaining your approach

class MergeTwoSortedArays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        int p1 = m - 1;
        int p2 = n - 1;
        int idx = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[idx] = nums2[p2];
                p2--;
            } else {
                nums1[idx] = nums1[p1];
                p1--;
            }

            idx--;
        }

        while (p2 >= 0) {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }

    }
}