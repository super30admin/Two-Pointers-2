/**
## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
 
Time Complexity :   O (N) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (80. Remove Duplicates from Sorted Array II)
Any problem you faced while coding this :       No
 */

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null){
            return 0;
        }
        
        int count = 1;
        int slow = 1;
        
        for(int fast = 1; fast < nums.length; fast++){
            // check if duplicates, increament count
            if(nums[fast] == nums[fast -1]){
                count++;
            }
            // else count reset to 1
            else{
                count = 1;
            }
            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String args[]) 
    { 
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] nums = {1,1,1,2,2,3};
        System.out.print(obj.removeDuplicates(nums));
    }
}