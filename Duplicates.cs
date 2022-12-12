// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

public class Solution {
    public int RemoveDuplicates(int[] nums) {
        if(nums == null ||  nums.Length == 0) return 0;
        int slow = 1;        
        int count = 1;
        for(int i = 1; i< nums.Length; i++)
        {
            if(nums[i] == nums[i-1] )
            {               
                count++;
            }
            else{
                count =1;
            }
            
            if(count <= 2)
            {
                nums[slow] = nums[i];
                slow++;
                
            }  
                                 
        }
        return slow;
    }
}
