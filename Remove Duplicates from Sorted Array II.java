// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes, it successfully ran on Leetcode. No issues

// Code
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;
        int count=1;
        
        for(;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}