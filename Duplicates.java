//Time Complexity: O(n)
//space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english


class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1, count = 1;
        
        
        for(int i=1;i<nums.length;i++) {
            //if current item is duplicate of prev
            if(nums[i] == nums[i-1]) {
                //increment count
                count++;
            } else { // no duplicate encountered yet
                count = 1;
            }
            
            if(count<=2) {
                //we overwrite at index j with new number which is at index i
                nums[j] = nums[i];
                j++;
            }
        }
        
        //we return index where we last overwrote
        return j;
    }
}