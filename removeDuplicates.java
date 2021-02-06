// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j = 1;
        int c = 1;
        int i;
        for(i=1;i<nums.length;i++) {
            
            // If the current element is a duplicate, increment the count.
            if(nums[i]==nums[i-1]) c++;
            else c=1; // Reset the count since we encountered a different element
            
            // For a count <= 2, we copy the element over thus
            // overwriting the element at index "j" in the array
            if(c<=2) {
                
                nums[j] = nums[i];
                j++;
                
            }
            
        }
        
        return j;
        
    }
}
