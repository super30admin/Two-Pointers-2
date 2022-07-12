// Time Complexity : O(m + n) where m = nums1.length and n = nums2.length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Problem: https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = m - 1;
        int q = n - 1;
        int r = m + n - 1;

        while(r >= 0){
            if(q < 0){
                break;
            }
            if(p >= 0 && nums1[p] > nums2[q]){
                nums1[r] = nums1[p];
                p--;
            }else{
                nums1[r] = nums2[q];
                q--;
            }
            r--;
        }

    }
}