// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
Move fast through the array. Use slow for writing the element and fast for reading the element
If the current number is the same as the previous, increment count; otherwise reset count = 1
If count ≤ k, copy nums[fast] to nums[slow] and advance slow
If count > k, skip writing (just move fast)
At the end, slow is the new length of the modified array
 */

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int slow = 0;
        int fast = 0;
        int k = 2;

        while(fast < nums.length){
            if(fast != 0 && nums[fast] == nums[fast - 1]){
                count++;
            }
            else
            //reset count, we encountered an unique element
                count = 1;
            if(count <= k){
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
            else
                fast++;
            
        }
        return slow;
    }
}