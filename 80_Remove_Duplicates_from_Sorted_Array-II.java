
// Time Complexity : O(length of array)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2)
            return nums.length;
        int index=2,i=2,flg=nums[1]==nums[0]?1:0,prev=nums[1];
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                if(flg==0){
                    flg=1;
                    nums[index++]=nums[i];
                }
            }else{
                nums[index++]=nums[i];
                flg=0;
            }
            i++;
        }
        
        return index;
    }
}
