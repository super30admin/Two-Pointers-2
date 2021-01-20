// Time Complexity : O(n)
// Space Complexity : O(1) Inplace manipulation of data in nums.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 2 pointer approach.
//Count is maintained for each unique value. When count is <2, we copt the value at fast pointer to num[slow]. 


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int slow = 1;

        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1; //reset the count
            }

            if(count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }
}
