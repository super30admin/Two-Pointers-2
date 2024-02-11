// Time Complexity : O(n) [n = nums.length]
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * Initailse a slow ptr and count variable
 * if idx == 0 or current element is not equal to previous element then it is new unique element 
 * then set the count = 1 ELSE increase the counter by 1
 * Check if count is less than equal to K [2 duplicates allowed] then put the current element at slow ptr idx and increase the slw ptr
 * Since it keeps track to current position with only max 2 dupliactes
 */

// Your code here along with comments explaining your approach

class DuplicateInSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int n = nums.length;

        int slow = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                cnt = 1;
            } else {
                cnt++;
            }

            if(cnt <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }
}