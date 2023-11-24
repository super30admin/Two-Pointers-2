// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/**
 * Maintain 2 pointers, 1 for iterating, other is slow pointer -> to maintain the index with just k duplicates. Everytime an element is same as the previous element, increment
 * the iterating pointer. Increment the slow pointer until count is <= k and copy the current element to the slow pointer index. If the current elemen is not same as the previous
 * element, reset the count to 1.
 */
class Solution {
    public int removeDuplicates(int[] nums) {

        int slow = 1;
        int count = 1;
        int k = 2;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            }
            else {
                count = 1;
            }

            if(count <= k) {
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }
}