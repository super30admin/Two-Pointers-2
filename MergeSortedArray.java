// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * We compare elements of both the arrays from end.
 * We put the greater element on the end of the first array and decrement the index accordingly.
 * Finally we copy the elements from the second array if left into the nums1 array.
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if (n == 0) return;
        
        int index1 = m - 1;
        int index2 = n - 1;
        
        int index = m + n - 1;
        
        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] >= nums2[index2]) {
                nums1[index] = nums1[index1];
                
                index1--;
                index--;
            } else if (nums1[index1] < nums2[index2]) {
                nums1[index] = nums2[index2];
                
                index--;
                index2--;
            }
        }
        
        // copy elements from nums2 into nums1 if left
        
        while(index2 >= 0) {
            nums1[index] = nums2[index2];
            
            index--;
            index2--;
        }
    }
}
