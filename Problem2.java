// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : y
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m-1, p2 = n-1, ptr = m+n-1;
        while(ptr >= 0) {
            if(p2<0) break;
            
            if(p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[ptr--] = nums1[p1--];
            } else {
                nums1[ptr--] = nums2[p2--];
            }   
        }  
    }
}
