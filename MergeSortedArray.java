//Time: O(m+n)
//Space: O(1)
//Leetcode: https://leetcode.com/submissions/detail/623256242/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        int i = m - 1; int j = n - 1; int k = nums1.length - 1;
        
        while( j >= 0 && i >= 0) {
            
            if(nums2[j] >= nums1[i]) {
                nums1[k] = nums2[j];
                j--;
                k--;
            } else {
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }
        
        if(i < 0 && j >= 0) {
            while(k >= 0 ) {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
      
        
    }
}