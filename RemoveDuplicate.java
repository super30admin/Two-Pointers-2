
// Time Complexity :O(n)
// Space Complexity :(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// two pointer

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        //edge case
        if(nums==null || nums.length==0) return 0;
        int j =1;// Keep tracking of length
        int count =1;
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<=2)
                nums[j++]=nums[i]; // remove extra element
        }
        return j;
    }
}