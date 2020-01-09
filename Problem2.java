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
        if( (nums1 == null && nums2 == null) || (nums1.length == 0 && nums2.length == 0))
            return;
        
        int cnt = 0;
        
        if(nums2.length > 0)
        {
            for(int i=m; i < m+n; ++i)
            {
                nums1[i] = nums2[cnt];
                cnt++;
            }
        }
        
        Arrays.sort(nums1);
    }
}