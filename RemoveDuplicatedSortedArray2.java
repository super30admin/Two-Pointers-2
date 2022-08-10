// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// 2 pointer approach.
// slow pointer will maintain the elements that we need to return
// fast pointer will process all the elements in the input array
// we return slow pointer as that represents our result with required output.

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        
        // init slow and fast from 2nd element
        int slow = 1;
        int fast = 1;
        
        int k = 2;
        
        // fast will reach end of the array before slow at worst case
        while (fast < nums.length) {

            // compute the occurances of the current element
            if (nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }

            // if the number of occurances are withing range of k, write at slow pointer position
            // increment slow
            if (count <= k) {
                nums[slow] = nums[fast];
                slow++;
            }
            
            // fast moves one position ahead in any case
            fast++;
        }
        
        return slow;
    }
}