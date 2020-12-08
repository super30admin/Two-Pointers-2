/** Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
* Time complexity O(N). Space complexity O(1)
* Code submitted on leetcode
*/
public class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int len = nums.length;
        if(len <= 2) return len;
        int count = 1;
        for(int i = 1; i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]) 
               {
                  count ++;
               }
            else 
                {
                    count = 1;
                }
            if (count <= 2)
                {
                    nums[j++] = nums[i];
                 }
            
        }
              
        return j;
    }
    
}
