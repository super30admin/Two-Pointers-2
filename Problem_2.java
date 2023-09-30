/*

Problem2 (https://leetcode.com/problems/merge-sorted-array/)

Time Complexity : O(m+n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(n==0){
            return;
        }

        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;

        while(p1 >=0 && p2 >= 0){
            nums1[p3] = Math.max(nums1[p1], nums2[p2]);
            if(nums1[p1] > nums2[p2]){
                p1--;
            }
            else{
                p2--;
            }
            p3--;
        }

        while(p2 >= 0){
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }

    }
}