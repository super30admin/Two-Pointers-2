class Solution {
 
    // Time Complexity: O(n) 
    // Space Complexity: O(1)
   
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        
        int index = 2; // Start from index 2 as first two elements are always allowed
        
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) { // Allow element if it is not a duplicate appearing more than twice
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index;
    }
}
