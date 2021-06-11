
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : Start the slow and fast pointer from the index 1. 
// Compare the current with previous no. If its duplicate increase the count of fast and slow ptr( do not move slow ptr after allowed duplicate count)
// when the count is less than k swap i and j. if not move only fast pointer.
// return j once end of the arr is reached.



class Solution {
    public int removeDuplicates(int[] nums) {
      // null case
      if(nums.length == 0 || nums == null) {
        return 0;
      }
      
      // start slow pointer at index 1 and initial count is 1
      int j = 1;
      int count = 1;
      
      //compare the number with its previous no
      for(int i = 1; i< nums.length; i++) {
        if(nums[i] == nums[i-1]) { // if same increase count
          count++;
        } else { // unique reset counter
          count =1;
        }
        
        if(count <=2) { // less than allowed duplicate then swap or else just move fast pointer to next
          nums[j] = nums[i];
          j++;
        }
      }
      
      return j;
    }
}