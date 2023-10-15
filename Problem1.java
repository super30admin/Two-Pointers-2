// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
class Solution {
    public int removeDuplicates(int[] nums) {
        int slo = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(i==0 || nums[i]!=nums[i-1])
                count = 1;
            else
                count++;
            if(count <= 2){
                nums[slo] = nums[i];
                slo++;
            }}
            
            return slo;
    }
}