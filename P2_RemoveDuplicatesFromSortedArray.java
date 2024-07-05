// Time Complexity : O(n)
// Space Complexity : O(m)
// Did this code successfully run on Leetcode : yes

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int slow = 0;
        for(int i=1 ;i<nums.length ;i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else{
                 count = 1;
            }
            if(count <= 2) {
                slow++;
                nums[slow] = nums[i];
            }
        }
        return slow+1;
    }
}