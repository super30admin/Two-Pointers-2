class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n=nums.length;
        int d=0;
        int l=0;
        int i=0;
        while(l<n)
        {
            if(l>0 && nums[l]!=nums[l-1])
                d=0;          
            if(d>=2)
            {
               l++;
               continue;
            }
            d++;         
            nums[i]=nums[l];
            i++;
            l++;
        }
        
        return i;
        
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no