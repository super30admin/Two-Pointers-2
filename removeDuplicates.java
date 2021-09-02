// Time Complexity: We are only traversing whole array once: O(n)
// Space complexity: Performing in place manipulation: O(1)
// Did you Complete it on leetcode: yes
// Any problems faced: Could not come up with solution.

// Write your approach
// Idea here is to take 2 pointers with one action pointer checking its next element
// if equal then performing a while loop to keep moving until a new value is found
// a 2 element for loop is performed to assign left 2 values value of the two values we have reached and move left pointer 2 steps and right pointer 1 steps
// continue this until end of string is reached
// in case there is single occurence assign left pointer to the right pointer value
// and move both pointers.
// left pointer signifies index post with garbage value exits
class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0; int right = 0;
        while(right<nums.length) {
            if(right+1<nums.length && nums[right+1]==nums[right]) {
                while(right+1< nums.length && nums[right+1]==nums[right]){
                    right++;
                }
                for(int i=0; i<2; i++) {
                    nums[left++] = nums[right];
                }
                right++;
            } else {
                nums[left++] = nums[right++];
            }
        }
        return left;
    }
}