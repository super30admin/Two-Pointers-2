
// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//Start from the ends of both arrays and compare the largest remaining elements.
// Place the larger value at the end of nums1 and move the corresponding pointer backward.
// After one array is exhausted, copy any leftover elements from nums2 into nums1 since they are already sorted.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;       // pointer for nums1
        int j = n - 1;       // pointer for nums2
        int k = m + n - 1;   // pointer for placement in nums1
        
        while (i >= 0 && j >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }

        // Copy remaining elements from nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}
