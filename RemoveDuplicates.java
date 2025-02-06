// Time Complexity :O(n)
// Space Complexity :O)1_
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // If ≤2 elements, return as is

       int slow = 2; // Start from index 2, as the first two elements are always valid

       for (int fast = 2; fast < nums.length; fast++) {
           // Allow at most two occurrences
           if (nums[fast] != nums[slow - 2]) {
               nums[slow] = nums[fast];
               slow++;
           }
       }

       return slow;
   }
    
}
