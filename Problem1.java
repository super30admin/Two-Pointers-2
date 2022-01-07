// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : y
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int ptr = 1, count = 1;
        
        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] == nums[i]) {
                count++;
            }  else {
                count=1;
            }
            
            if(count < 3) {
                nums[ptr++] = nums[i];
            }
        }
        
        return ptr; 
    }
}
