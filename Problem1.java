// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Y
// Three line explanation of solution in plain english
// keep track of position of array as curr variable
// First copy two elements in first two positions i.e.using curr variable( here we are allowing the duplicate upto 2 times) 
// From 3rd element , we just look value of array > previous second value, if it greater ,then insert the new value at the curr position and increement current. if it same we dont insert the value(remove the duplicate elements.)

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
   int curr = 0;
   for (int n : nums)
      if (curr < 2 || n > nums[curr - 2]){
         nums[curr] = n;
          curr++;
      }
   return curr;
 }
}
