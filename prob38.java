// S30 Big N Problem #38 {Medium}
// 80. Remove Duplicates from Sorted Array II
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :None


// Your code here along with comments explaining your approach
// Iterating through the list and only entering if the condition is satisfied
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null) return 0;
        if(nums.length<=2) return nums.length;
        
        int i=0;
        for(int n:nums){
            if(i<2 || n>nums[i-2]){
                nums[i]=n;
                i++;
            }
        }
        //System.out.println(i);
        return i;
    }
}
