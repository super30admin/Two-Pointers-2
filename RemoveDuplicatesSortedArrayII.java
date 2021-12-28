//Time Complexity:
//Space Complexity:
public class RemoveDuplicatesSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int j = 1, count = 1;
        for(int i = 1 ; i < nums.length; i++)
        {
            if(nums[i-1] == nums[i])
            {
                count++;
            }
            if(nums[i-1] != nums[i])
            {
                count = 1; // reset the count for next numbers count
            }
            if(count < 3)
            {
                nums[j] = nums[i];
                j++; // keeps track of number of duplicate elements
            }
        }
        return j;
    }
}
