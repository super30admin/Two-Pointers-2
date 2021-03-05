// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//  - starting from last index, compare both elements from nums1 and nums2
//  - whichever is larger, put it at last index of nums1 then decrement pointers
//  - check in nums2, if there is any element remaining.

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        if (m == 0 && n == 0) return;

        while (i >= 0 && j >= 0) {
            if (nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
            else {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
