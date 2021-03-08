// Time Complexity : O(n+m) where n - length of array nums1 till the numbers end , m - length of array nums2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
Using Two Pointers Approach, iterating from the "m" and "n" points in nums1 and nums2 respectively.
While iterating compare the values at each point when iterating from m and n.
Insert the higher values from backwards in nums1 array.
*/

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m-1;
        int b = n-1;
        for(int i=m+n-1;i>=0;i--){
            if(b < 0) break;
            if(a>=0 && nums1[a] > nums2[b])
                nums1[i] = nums1[a--];
            else
                nums1[i] = nums2[b--];
        }
    }
}
