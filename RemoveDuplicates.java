/**
Problem: Remove duplicates.
Time Complexity: O(n) where n is the size of the array.
Space Complexity : O(1)
Did it run on Leetcode: Yes

*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int indicator = 1;
        int prev = 0;
        int next = 1;
        int flag = 0; //denotes if there has already been 1 duplicate
        while(next<nums.length) {
            if(nums[prev] == nums[next]) {
                if(flag == 0) {
                    nums[indicator] = nums[next];
                    indicator++;
                    next++;
                    flag = 1;
                }
                else {
                    next++;
                } 
            } 
            else {
                prev = next;
                nums[indicator] = nums[next];
                indicator++;
                next++;
                flag = 0;
            }
        }
        return indicator;
    }
}
