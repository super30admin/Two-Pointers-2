/**
Problem: Remove duplicates.
Time Complexity: O(n) where n is the size of the array.
Space Complexity : O(1)
Did it run on Leetcode: Yes

Approach: 3 pointers.
1. We keep three pointers, previous, next and indicator. Initially, previous points to 0, next and indicator to 1.
2. We keep track of the duplicates(if more than 2) using a flag. 
3. If we find more than two duplicates, we move the next element to the current position(Indicator). Here indicator makes sure that the elements to the left of it are proper.(just 2 duplicates, if any)
4. In the end, we return the length of the indicator, because it's index gives us the length of the already properly positioned elements.
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