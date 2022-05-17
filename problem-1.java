// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int removeDuplicates(int[] nums) {
        //Until i, no element appears more than twice
        int i=0, j=1;
        //Since j is iterating from the 2nd element count is set to 1 for 1st element
        int count=1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                count++;
                if(count>2){
                    j++;
                }
                else{
                    nums[i+1]=nums[j];
                    i++;
                    j++;
                }
            }
            else{
                count=1;
                nums[i+1]=nums[j];
                j++;
                i++;
            }
        }
        //return +1 since 0 indexed
        return i+1;
    }
}
