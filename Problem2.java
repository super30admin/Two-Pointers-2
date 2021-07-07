// Time Complexity : 
//      merge() - O(n*log(n))
//      
// Space Complexity :
//      merge() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        
        int i = m-1, j = n-1, k = m + n - 1;
        
        while(i >= 0 && j >= 0 && k >= 0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[k] = nums1[i];
                --k;
                --i;
            }
            else
            {
                nums1[k] = nums2[j];
                --k;
                --j;
            }
        }
        
        while(i < 0 && k >= 0)
        {
            nums1[k] = nums2[j];
            --k;
            --j;
        }
    }
}
