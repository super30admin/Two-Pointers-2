// Time Complexity : O(n) where n is number of rows.
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return 1;
        int i=1;
        int j=1;
        int count=1;
        
        while(i<nums.length)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            
            if(count<=2)
            {
                nums[j]=nums[i];
                j++;
            }
            
            i++;
        }
        return j;
    }
}