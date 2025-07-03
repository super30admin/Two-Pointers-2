// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Three line explanation of solution in plain english - I used 2 pointers - one to store the  index of corrected array, and one for iterating over the given array nums. If I see an element for less than or equal to 2 times, I write it in the front of the array and move the front pointer (j), if the count is more than 2, I keep moving forward till I find another element to write to front. At the end, I return j as it is the size of the corrected array.

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1, count = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]) count++;
            else count = 1;
            if (count<=2) nums[j++] = nums[i];
        }
        return j;
    }
}
