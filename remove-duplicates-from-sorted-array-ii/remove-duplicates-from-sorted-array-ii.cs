public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int j=1;
        int count =1;
        
        for(int i=1;i<nums.Length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count =1;
            }
            if(count<=2)
            {
                nums[j++] = nums[i];
            }
        }
        return j;
        
    }
}
