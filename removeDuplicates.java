// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
/* Check the count, update the array */

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int i =1; int j =1; int count = 1;
        int n = nums.length;
        
        for(i =1;i<n;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }
}


