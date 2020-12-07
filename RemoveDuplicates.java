// Time Complexity :O(N) n are the number of elements in the given array.
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach:
class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;int i=0;
        while(i<nums.length){
            int j=i+1;
            while(j<nums.length && nums[j]==nums[i])
                j++;
            if(j-i>2){
                nums[index++]=nums[i];
                nums[index++]=nums[i];
                i=j;                
            }
            else{
                while(i!=j)
                nums[index++]=nums[i++];
            }
        }
        if(i==nums.length-1)
            nums[index++]=nums[i];
        return index;
        
    }
}