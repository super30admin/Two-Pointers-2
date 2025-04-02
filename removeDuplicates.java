class Solution {
    public int removeDuplicates(int[] nums) {
        int count=2;

        for(int i=2;i<nums.length;i++)
        {
            if(nums[i] != nums[count-2])
            {
                nums[count] = nums[i]; 
                count++;
            }
        }
            return count; 
        }
}

//[1,1,1,2,2,3]
//[1,1,2,]
//[0 ,1,1,2,2,2]
