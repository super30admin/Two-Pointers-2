// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
Use a slow pointer to build the final array while scanning with i.
Track how many times the current number has appeared; only allow it if count ≤ 2.
Whenever allowed, place the element at slow, ensuring every number appears at most twice.
*/

public class Problem1 {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int cnt = 1;

        for(int i = 1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]) {
                cnt++;
            } else {
                cnt = 1;
            }

            if(cnt <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }
}
