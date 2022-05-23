//Time Complexity: O(m)
//Space Complexity:o(1)
//Did this code successfully run on Leetcode :Yes
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