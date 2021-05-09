//Time Complexity : O(n)
//Space Complexity : O(1). 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0 || nums == null ){return 0;}
        int count = 1;
        int i = 1;
        int j = 1;
        int k = 2;
        
        while(i < nums.length){
        if(nums[i] == nums[i-1]){
            
            count ++;
        
        if(count <= k){
            
            nums[j] = nums[i];
            i ++;
            j ++;
            }
            
            else{
                
                i ++;
            }
        }
        else{
            
            count = 1;
            nums[j] = nums[i];
            i ++;
            j++;
            
             }
        }
        return j;
    }
}