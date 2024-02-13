// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : Using 2 pointers to make sure each distinct number occurs atmost twice in the array.
// If there are more duplicates, we override them with the next distinct number in the sorted array.

public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int count = 0;
        int ptr = 0;
        for(int i = 0; i < nums.Length; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                count = 1;
            }
            else {
                count++;
            }
            if(count <= 2) {
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return ptr;
    }
}