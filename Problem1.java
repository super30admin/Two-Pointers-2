//## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

// Time Complexity : O(N), where N is the size of input array
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

    // Use two pointers slow and fast
    // slow - last position of insertion of atmost k occurences of an element
    // fast - iterate over the input and update count

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int slow=0, fast=0;
        int k=2;

        while(fast<nums.length){
            if(fast==0||(nums[fast]==nums[fast-1])){
                // Same element as previous, increment count
                count++;
            }else{
                // Diff element, reset count
                count=1;
            }

            if(count<=k){
                // Current element count is < k(or 2)
                // We can write it in nums
                nums[slow]=nums[fast];
                slow++;
            }

            // Move onto the next element
            fast++;
        }

        return slow;
    }
}