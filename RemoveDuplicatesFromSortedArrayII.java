
// Time Complexity : O(n) n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int fast = 1;
        int slow = 1;
        while(fast < nums.length) {
            // check if nums[fast] is equal to nums[fast - 1]
            if(nums[fast] == nums[fast - 1]) {
                // increment the count
                count++;
            }
            else {
                // set count to 1
                count = 1;
            }
            if(count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
            // fast is incremented everytime
            fast++;
        }
        return slow;
    }
}
