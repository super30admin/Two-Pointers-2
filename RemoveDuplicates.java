
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
update existing array wit elements only if the count is <=2
 */

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int index=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[j-1]){
                count++;
            } else {
                count=1;
            }
            if(count<=2)
                nums[index++]=nums[j];
        }
        return index;
    }
}
