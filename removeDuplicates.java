
// Time Complexity :O(m) where m is length of array
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes

//we'll have a slow pointer and a fast pointer, fast pointer will count the number of times element is repeating and
// if element is repeating less than 2 times, we'll overwrite slow pointer value
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1) {
            return 1;
        }
        int count = 1;
        int slow = 1;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        System.out.println(slow);
        return slow;
    }
}