// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int count = 1;
        int slowPtr = 1;
        //int fastPtr = 1;
        for(int i = 1; i< nums.length; i++){    
            if(nums[i] == nums[i-1]){
                count++;
                if(count <= 2){                   
                    nums[slowPtr] = nums[i];
                    slowPtr++;
                    //fastPtr++;
                }
                else{
                    count++;
                    //fastPtr++;
                }             
            }
            else if(nums[i] != nums[i-1]){
                count = 1;
                nums[slowPtr] = nums[i];
                slowPtr++;
                //fastPtr++;
            }
        }
        return slowPtr;
    }
}