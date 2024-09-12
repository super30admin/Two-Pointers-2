// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/merge-sorted-array/submissions/1053446563/
// Three line explanation of solution in plain english
/*
 * Maintain 3 pointers, p1 at the valid length of nums1, p2 at the valid length of nums2 and p3 at the end of nums1
 * Check the max of values at p1 and p2 and change the value to the max(p1, p2)
 * When p1<0, check p2 elements are arranged in nums1 
 */
// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2 == null || nums2.length == 0)
            return;
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;
        while(p1 >=0 && p2>=0){
            nums1[p3] = Math.max(nums1[p1], nums2[p2]);
            if(nums1[p1]>nums2[p2]){
                p1--;
            }
            else
                p2--;
            p3--;
        }
        while(p2>=0){
            nums1[p3]= nums2[p2];
            p2--;
            p3--;
        }
    }
}
