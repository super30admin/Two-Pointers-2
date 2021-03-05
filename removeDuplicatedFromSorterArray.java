
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// In this approach we use two pointers starting from position one of the array. Whenever we see the previous element is equal to the current element
// we incremenet the counter and replace the element at second pointer with the element at first pointer.In the end we return the index of the first
// pointer which is the position until whihc we dont have more than 2 repeated elements for each number.
class Solution {
    public int removeDuplicates(int[] nums) {
      if(nums == null || nums.length==0)
        return 0;
      int i =1;
      int count = 1;
      
      for(int j=1;j<nums.length;j++)
      {
          if(nums[j]==nums[j-1])
          {
             count ++;
          }
          else
          {
              count =1;
          }
        
          if(count <= 2)
          {
            nums[i]= nums[j];
            i++;
          }
      }
      return i;
    }
}