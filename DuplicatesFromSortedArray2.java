// Time Complexity : O(n).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach :  We have two pointers, one used to swap and other to iterate through the array. We increase the counter if two elements are
// equal adn based on the condition we swap in the array so that the final resultant array is achieved.

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int j = 1;//pinter for swapping result elements
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){ //if two consecutive elements are equal
                count++;
            }else{
                count = 1;
            }
            if(count <= 2){ //as max allowed is twice
                nums[j] = nums[i];
                j++;
            }
        }
        return j;//result length
    }
}