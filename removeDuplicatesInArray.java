
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// we make use of two pointers; one fast which is nothing but iterating one which spans the entire array
// the slow pointer and counter does the job. any time when count is <= 2 we just swap contents in fast and slow
// pointers 
// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 1;
        int count = 1;
        for(int fast = 1; fast < nums.length; fast++) {
            if(nums[fast] == nums[fast - 1]) {
                count++;
            }
            else {
                count = 1;
            }
            if(count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
}
}