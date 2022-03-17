// Time Complexity : O(N) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;
        int count=1;
        
        while(i<nums.length){
            if(nums[i]==nums[i-1])
                count++;
            else{
                count=1;
            }
            
            if(count>2){
                i++;
            }
            else{
                nums[j++]=nums[i++];
            }
        }
        return j;
    }
}
