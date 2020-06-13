class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int count=1;
        int i=1,j=1;
        while(j<nums.length)
        {
            if(nums[j-1]==nums[j])
            {
                count++;
                
            }else
            {
                count=1;

            }
            if(count<=2)
            {
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        return i;
        
    }
}