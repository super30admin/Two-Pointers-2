//88. Merge Sorted Array - https://leetcode.com/problems/merge-sorted-array/
//Time Complexity: O(m+n)
//Space Complexity: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //base case
        if(n == 0){
            return;
        }
        int p1 = nums1.length;
        int p2 = p1-1;
        while(n > 0 && m > 0){
            if(nums2[n-1] >= nums1[m-1]){
                nums1[p2] = nums2[n-1];
                n--;
            }else{
                nums1[p2] = nums1[m-1];
                m--;
            }
            p2--;
        }
        while (n > 0) {
            nums1[p2] = nums2[n-1];
            n--;
            p2--;
        }
    }
}