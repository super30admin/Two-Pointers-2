// Time Complexity :O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach: Using 3 pointers and updating each pointer based on requirement

class Solution {
    public int removeDuplicates(int[] nums) {  
        int p1 = 1, p2 = 1;
        int  count = 1;
        while(p1 <= nums.length-1){
          if(nums[p1] == nums[p1-1]){
              count++;
                  if(count<=2){
                      nums[p2] = nums[p1];
                      p1++;
                      p2++;
                  }
                  else{
                      p1++;
                  }
          }
            else{
                count = 1;
                nums[p2] = nums[p1];
                p1++;
                p2++;
            }
        }
        return p2;
    }
}
