// Time Complexity : O(MxN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 2;
        int count = 0;
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                nums[idx] = nums[i+1];
                idx += 2;
            } 
        }
        return idx;
    }
}