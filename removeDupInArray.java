// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
//  here we are making sure that elements placed at position j are seen less than or equal to 2 times only.

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 1, j = 1, count = 1;
        
        while(i < nums.length) {
            
            if(nums[i] == nums[i - 1]){
                count++;
            }
            else
                count = 1;
            
            if(count <= 2) {
                nums[j] = nums[i];
                j++;
            }
            i++;      
            
        }
        return j;
    }
}