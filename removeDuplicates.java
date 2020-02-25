/*
Time complexity - O(n)
space complexity- O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        
        // Initialize the counter and the second pointer.
        int j = 1, count = 1;
        
        // Start from the second element of the array and process elements one by one.
        for (int i = 1; i < nums.length; i++)  {     
            // If the current element is a duplicate, increment the count.
            if (nums[i] == nums[i - 1]) 
                count++;
            // Reset the count since we encountered a different element than the previous one.
            else 
                count = 1;
            // For a count <= 2, we copy the element over, overwriting the element at index "j" in the array
            if (count <= 2) 
                nums[j++] = nums[i];
        }
        return j;
    }
}
