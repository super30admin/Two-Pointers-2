
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:  Use a counter to keep track of the occurence of elements
// and ovveride inplace for elements occuring at max 2 times, and ignore other occurences.

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int j = 0;
        for (int i = 0, count = 0; i < nums.length; i++){
            // keep count of same numbers
            if (i==0 || nums[i] == nums[i-1]) count++;
            //reset count when number changes
            else count = 1;
            //overwrite the numbers in the array inplace
            if (count <= 2) nums[j++] = nums[i];
        }
        return j;
    }
}