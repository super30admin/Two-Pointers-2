 // Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
class Solution {
    public int removeDuplicates(int[] nums) {
      //slow pointer to over write the duplicate element
        //fast- to count
        //slow and fast at 2nd element then if count <=2 then overwrite nums[slow] with nums[fast] 
        
        int slow =1;
        //int fast =1;
        int count =1;
        
        for(int fast=1;fast<nums.length;fast++){
            //check the count of duplicates
            if(nums[fast]==nums[fast-1]){
                count++;
            }
            //reset the counter
            else{
                count =1;
            }
            //to restrict the duplicate size to 2 and rewrite the 3rd duplicate
            if(count<=2){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        //returning slow since fast would be out of index
         return slow;   
        
    }
}