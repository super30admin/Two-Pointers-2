// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// I will be using 2 pointer approach and a count variable to keep count of repeated numbers.
public class RemoveDuplicatesSolution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int count = 1;
        int index = 1;
        for(int i = 1; i < nums.length; i += 1) {
            if(nums[i - 1] == nums[i]) {
                count += 1;
            } else {
                count = 1;
            }
            if(count <= 2) {
                nums[index] = nums[i];
                index += 1;
            }
        }
        return index;
    }
}