// ## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int count = 1;
        int slow = 1;
        for (int fast = 1;fast<nums.length; fast++) {
            if (nums[fast] == nums[fast-1]){
                count++;
            } else {
                count = 1;
            }
            if (count <=2) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}