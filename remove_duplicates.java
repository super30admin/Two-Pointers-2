class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return 0;
        }
        
        int count =1;
        int check =1;
        
        int pointer =1;
        
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1] && check==2)
            {
                continue;
            }
            if(nums[i]==nums[i-1] && check==1)
            {  
                check++;   
            }
            else if(nums[i]!=nums[i-1])
            {
                check=1;   
            }
            nums[pointer] = nums[i];
            count++;
            pointer++;
            
        }
        return count;
    }
}
