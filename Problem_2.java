// Time Complexity : O(n + m), where n is no of rows and m is number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We use 3 pointers, 2 of them point to end of each array and 3rd one points to end of merged array. We traverse from right to left
   and compare the 2 values. The greater value is inserted at ith cell and both pointers decremented. IF we have traversed 1st array
   and still have some elements left in 2nd array, we just copy them into 1st array.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = (m + n) - 1;

        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] >= nums2[p2]) 
                nums1[i--] = nums1[p1--];
            else
                nums1[i--] = nums2[p2--];
        }

        while(p2 >= 0)
            nums1[i--] = nums2[p2--];
    }
}