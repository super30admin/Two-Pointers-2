// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes, 0ms
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

// till a new element is not encountered, append it nums else reset the counter and add it to the list.


class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1, index = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[index-1]){
                if(count > 0){
                    nums[index++] = nums[i];
                    count--;
                } 
            } else {
                count = 1; //reset counter
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}