// Time Complexity :O(n) n-length of the array nums
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/* Maintain a count variable that counts the repeats comparing the value in the current index to previous index. Index j starts from 1 as well as index i.
 If the count is less than the repeats allowed then store the value in the array having i index and then increment i */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int count=1;
        int i=1,j=1;
        while(j<nums.length)
        {
            if(nums[j-1]==nums[j])
            {
                count++;
                
            }else
            {
                count=1;

            }
            if(count<=2)
            {
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        return i;
        
    }
}