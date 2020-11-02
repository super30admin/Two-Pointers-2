// Time Complexity :  O(N ) - one pass
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        //int i = 1;
        int j = 1;
        int count = 1;
        for(int i = 1;i < nums.length; i++){
            if(nums[i-1] == nums[i]) {
                count += 1;
            }else{
                count = 1;
            }
            if(count <= 2){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}