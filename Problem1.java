// Time Complexity : don't know
// Space Complexity : O(1) - as in place swapping
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Run through the array with two pointers i = 0 and j = 2. If the values at i and j are same, so there is duplicate and reshape the array. repeat the process till the j is less than the length of the loop.

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length<3){
            return length;
        }
        boolean duplicate = false;
        for (int i = 0, j = 2; j<length; i++,j++){
            if(nums[i] == nums[j]){
                duplicate = true;
            }
            if(duplicate){
                for(int k = j;k<length;k++){
                    nums[k-1]=nums[k];
                }
                i--;
                j--;
                length--;
                duplicate = false;
            }
        }
        return length;
        
    }
}