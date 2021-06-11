// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * we keep a pointer start to store the index which serves as the index before which we put valid elements. 
 * start will always point to one index ahead of valid elements.
 * If we find a invalid element, we don't move start ahead.
 * if we find a valid element, we swap with start and move start one position ahead.
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int start = 1;
        
        int count_instances = 1;
        
        while (i < nums.length) {
            if(nums[i] == nums[start - 1]) {
                count_instances++;
                
                if(count_instances <= 2) {
                    // valid
                    swap(nums, start, i);
                    
                    i++;
                    start++;
                } else {
                    i++;
                }
            } else if (nums[i] != nums[start - 1]) {
                count_instances = 1;
                
                swap(nums, start, i);
                start++;
                i++;
            }
        }
        
        return start;
     }
    
    private void swap(int[] nums, int ind1, int ind2) {
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }
}
