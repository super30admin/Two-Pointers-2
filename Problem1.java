// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,count=0,len=0;
        while(i<nums.length){
            if(i==0||nums[i]!=nums[i-1]){
                count=1;
            }
            else if(nums[i]==nums[i-1]) count++;
            if(count<3){
                nums[len++]=nums[i];
            }
            i++;
        }
        return len;
    }
}