// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
/*Start from the last index of arrays, check the max value and assign that value to the last index of nums1*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 || nums2.length == 0) return;
        
        int p1 = m-1; int p2 = n-1; int p3 = nums1.length -1;
        
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p3] =nums1[p1];
                p1--;
            }
            else
            {
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }
        
        while(p2 >= 0){
            nums1[p3] = nums2[p2];
            p3--; p2--;
        }
    
    }
}