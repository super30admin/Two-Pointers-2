// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int removeDuplicates(int[] nums) {
        // return 0 if array is null or empty
        if(nums == null || nums.length == 0) return 0;
        // intialize count and j pointer
        int count = 0; int j = 0;
        // iterate through the array
        for(int i = 0; i < nums.length; i++){
            // increment count if two consecutive elements are same
            if(i > 0 && nums[i] == nums[i - 1]){
                count++;
            } else count = 1; //if new element occurs, set count to 1
            if(count <= 2){
                // replace the element and increment j pointer
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}