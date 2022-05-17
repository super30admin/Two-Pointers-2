
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1; // we initialise to 1 as there will be one value
        int index = 1; //the new array index
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){ //we check with previous
                count++;
            }else{
                count = 1;//reset counter if not same
            }
            if(count<=2){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}