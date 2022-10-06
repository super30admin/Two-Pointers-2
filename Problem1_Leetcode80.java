// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// TC : O(N)
// TC : O(1)

// 0 0 1 1 1 1 2 3 3

// we will use 2 pointer i and j.
// i will keep moving to check all elements
// j will move to indicate the position where value to be inserted
// both will start from 1
// count will be 1 because we are positioning i and j at index 1
// update the count to +1 if j and j - 1 is equal
// else if not equal then set count to 1
// if count is less than 3 then update the value at i with value at j


class Solution {
    public int removeDuplicates(int[] nums) {
        // base case
        if(nums == null || nums.length == 0) return 0;

        int count = 1;
        int j = 1;

        for(int i = 1; i < nums.length; i++) {

            // update the count based on below conditions
            if(nums[i] == nums[i - 1]) {
                count++;
            }
            else {
                count = 1;
            }

            // if count is less than 2 then update value at j with value at i and move j
            if(count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}