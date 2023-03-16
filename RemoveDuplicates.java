/*
Time Complexity - O(N) where N is the size of the input array nums.
Space Complexity - O(1)
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return nums.length;
        
        int writePtr = 1, count = 1;

        for(int readPtr = 1; readPtr < nums.length; readPtr++) {
            if(count == 2 && nums[readPtr] == nums[readPtr - 1])
                continue;
            count = (nums[readPtr] == nums[readPtr - 1]) ? count + 1 : 1;
            nums[writePtr++] = nums[readPtr];
        }
        return writePtr;
    }
}
