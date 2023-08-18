// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// 2 pointer: slow and fast 
class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums == null || nums.length ==0) return 0;
       int slow = 0; int count =1;
       for(int i = 1;i < nums.length; i++){ // fast pointer is i
           if(nums[slow] == nums[i]) count++; //counting duplicates
           else count = 1; // change count to new val
           if(count <= 2){
               slow++;
               nums[slow] = nums[i]; // replaceing with new val because we are allowed only 2 duplicates
           }
       } 
       return slow+1;
    }
}