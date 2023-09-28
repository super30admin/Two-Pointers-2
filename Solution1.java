//Leetcode Problem : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * I set count at 1 initially and use two pointers s (slow) and f (fast) to traverse through
 * the array. I set s at 1 and traverse for f = 1 till length of list. If nums[f] == nums[f-1],
 * I increment count by 1. Else, I set count to 1. If count <=2, I set nums[s] = nums[f]
 * and increment s. I return s at the end.
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int s = 1;
        for(int f=1;f<nums.length;f++)
        {
            if(nums[f]==nums[f-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<=2)
            {
                nums[s]=nums[f];
                s++;
            }
        }
        return s;
    }
}