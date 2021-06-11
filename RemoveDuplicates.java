// Time Complexity : O(n)), 
// Space Complexity : O(1),
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package twoPointer2;

public class RemoveDuplicates {
     public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        
        int count = 1, j = 1;
        for(int i = 1; i <nums.length; i++){
            if(nums[i] == nums[i - 1]) count++;
            else count = 1;
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }  
}
