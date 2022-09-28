class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(n==0) return;
        
        if(m==0) 
            for(int i=0;i<n;i++)
                nums1[i]=nums2[i];
        
        int i=m-1;
        int j=n-1;
        int idx=m+n-1;
        
        while(i>=0 && j>=0)
        {
            if(nums1[i]<nums2[j])
            {
                nums1[idx]=nums2[j];
                j--;
                idx--;
            }
            else 
            {
                nums1[idx]=nums1[i];
                i--;
                idx--;
            }
            
        }
        
        while(j>=0)
        {
            nums1[idx]=nums2[j];
            j--;
            idx--;   
        }
    }
}

// Time Complexity : O(M +N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no