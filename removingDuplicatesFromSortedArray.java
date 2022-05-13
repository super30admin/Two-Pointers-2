
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

class Solution {
    public int removeDuplicates(int[] nums) {
        int N = nums.length;
        // since we are counting the first number as unique in the array
        int count = 1;
        // as we have counted the first element as unique, we are starting the pointer from 1st pos
        int slow = 1;
        // fast pointer moves linearly
        for(int fast =1;fast<N;fast++) {
            // we keep counting until we find a new unique element
            if(nums[fast] == nums[fast-1])
                count++;
            // when we found a new unique element, we reset the count to 1
            else
                count = 1;
            //only copy the number for two positions.
            if(count<=2) {
                nums[slow] = nums[fast];
                //move the slow pointer until where we can start placing a new unique value from fast pointer
                slow++;
            }
        }
        return slow;
    }
}