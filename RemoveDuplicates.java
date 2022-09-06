// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int removeDuplicates(int[] nums) {
        //null check
        if(nums == null || nums.length == 0)
            return 0;

        int count = 1;
        int slow = 1;

        for(int fast = 1;fast<nums.length;fast++){
            if(nums[fast] == nums[fast-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}