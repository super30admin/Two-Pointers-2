class RemoveDuplicates-II {
    
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    
    public int removeDuplicates(int[] nums) {
        // Edge Case Checking
        if(nums == null || nums.length == 0)
            return 0;
        int i = 2;
        // Start from the second position in the array and traverse till end
        for(int j = 2; j < nums.length; j++){
            // if the element at current position is not the same as i-2 position -> then place it at position i (assuring that the duplicate elements would only occurr twice)
            if(nums[i - 2] != nums[j])
                nums[i++] = nums[j];
        }
        
        // return i -> as it denotes the new length of array
        return i;
    }
}