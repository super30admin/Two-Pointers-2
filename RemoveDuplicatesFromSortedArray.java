
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        
        int k = 2;
        int count =1;
        int index = 1;
        
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {            
                count = 1;
            }
            
            if(count <= k) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index;
    }
}