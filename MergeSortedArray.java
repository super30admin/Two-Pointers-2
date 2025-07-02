// Time Complexity: O(m + n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach:
// - In-place merge of two sorted arrays nums1 and nums2.
// - Start from the end of both arrays:
// - Compare elements at `i` and `j`:
//    - If nums1[i] > nums2[j], place nums1[i] at nums1[k].
//    - Otherwise, place nums2[j] at nums1[k].
// - Decrement pointers accordingly.
// - Continue until all elements of nums2 are merged into nums1.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Pointer at the end of each arrays
        int i = m-1;
        int j = n-1;
        //Pointer to track index where we will insert the sorted value
        int k = m+n-1;

        while(j>=0 ){
            // Check which one is greater and put value in nums1
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

    }
}