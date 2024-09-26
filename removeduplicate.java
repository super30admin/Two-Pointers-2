# Time Complexity : O(n)
# Space Complexity : O(1)


class Solution {
    
    public int removeDuplicates(int[] nums) {
    
        int j = 1, count = 1;
        

    
        for (int i = 1; i < nums.length; i++) {
            
    
            if (nums[i] == nums[i - 1]) {
                
                count++;
                
            } else {
                count = 1;
            }
            
            //
// For a count <= 2, we copy the element over so overwriting the element at index "j" in the array
          
            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}