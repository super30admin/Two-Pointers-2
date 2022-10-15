
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int slow=1;
        int count=1;
        
        for(int fast=1;fast<nums.length;fast++){
               if(nums[fast]==nums[fast-1]){
                        count++;
               }
            else{
                count=1;
            }
            
            if(count<=2){
                nums[slow]=nums[fast];
                slow++;
                
            }
        }
        return slow;
        
    }
}