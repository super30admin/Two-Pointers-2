// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length<3) return nums.length;

        // Start the counter from index 2
        int i=2;
        // Take another index j, which starts from 2 and goes till the end of the array
        for (int j=2; j<nums.length; j++) {

            // Check nums[j] with nums[i-2], since we want them to be different,
            // if they are not same, replace nums[i] with nums[j] and  we move i to the next index
            // if they are same the for loop will move j ahead
            if (nums[i-2] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
        }

        // Return i, since it has the count of new array
        return i;
    }
}