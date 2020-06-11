
// Time Complexity : O(n) n - length of gvn array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/**
 * Preserve a duplicate of the ele and move the rest of the other ele to that position
 */
// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int count = 1, i=1,j=1;

        while(i<nums.length){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count<= 2){
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}