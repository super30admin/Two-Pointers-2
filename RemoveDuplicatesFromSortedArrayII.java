// Time Complexity : O(n)
// Space Complexity : O(1)
// Method used : Two pointers

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 1, j = 1, count = 1;

        while(i < nums.length)
        {
            count = (nums[i] == nums[i - 1]) ? count + 1 : 1;

            if(count <= 2)
            {
                nums[j] = nums[i];
                ++j;
            }
            ++i;
        }
        return j;
    }
}