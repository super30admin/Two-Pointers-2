// Time Complexity: O(n)
//   - Single pass through the array with two pointers (fast and slow).
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach:
// - Use two pointers: 'fast' to iterate over the array, 'slow' to track the position to insert valid elements.
// - Initialize 'count' to track occurrences of the current number.
// - For each element:
//     - If the current number is the same as the previous one, increment the count.
//     - If it's a different number, reset count to 1.
// - If the count is less than or equal to k (2 in this case):
//     - Place the current number at the 'slow' pointer index and increment 'slow'.
// - Continue this process until 'fast' reaches the end of the array.
// - Return 'slow' as the length of the modified array with at most two duplicates allowed.

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int n = nums.length;

        int slow = 1;
        int fast = 1;
        int count = 1;

        while(fast < n){
            //If same value increment the count
            if(nums[fast] == nums[fast-1]){
                count++;
            }else{
                //Initialize count to 1 if new value
                count = 1;
            }
            //If valid occurence
            if(count <= k){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }
}