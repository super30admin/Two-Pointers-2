
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : 
/*
 * The indexes are taken at the m and n values, iterating from behind and placing the greater value at the end of nums1 array
 */

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        //take the indices and compare and store the grater value at the end of nums1 array
        int i=m-1,j=n-1;
        for(int k = nums1.length-1; k>=i+1 && j>=0; k--){
            if(i>=0 && nums1[i] >= nums2[j]){
                nums1[k] = nums1[i--];
            } else {
                nums1[k] = nums2[j--];
            }
        }
    }
}