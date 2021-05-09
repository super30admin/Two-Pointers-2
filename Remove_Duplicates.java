class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        int count = 0 , i = 0 , j = 0;
        while(i < nums.length && j < nums.length)
        {
            if(j > 0 && nums[j-1] == nums[j])
            {
                count++;
                if(count <= 2)
                {
                    nums[i] = nums[j];
                    i++;j++;
                }
                else
                {
                    j++;
                }
            }
            else
            {
                count = 1;
                nums[i] = nums[j];
                i++;j++;
            }
        }
        return i;
    }
}