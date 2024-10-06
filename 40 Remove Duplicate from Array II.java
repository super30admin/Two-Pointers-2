
// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int removeDuplicates(int[] nums) {

        int count = 0;
        int slow = 0;
        int k = 2;
        for(int fast =0;fast<=nums.length-1; fast++) {
            if (fast > 0 && nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= k) {
                nums[slow] = nums[fast];
                slow++;
            }
            
        }
        return slow;
    }
}