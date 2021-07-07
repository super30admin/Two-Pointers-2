// Time Complexity - O(n) where n is the length of nums array
// Space Complexity - O(1) constant extra space is used
// This solution worked on Leetcode
// For this solution, I used 2 pointers slow and fast. slow will be final pointer and fast is traversal pointer. I will use boolean flag and set it when the duplicate has appeared once. 

class Solution {
    public int removeDuplicates(int[] nums) {
    // Edge Case
        if(nums==null || nums.length==0)    
            return 0;
        //Logic
        int slow=0;
        int fast=1;
        boolean flag = false;
        // traverse till fast reaches end of array
        while(fast < nums.length){
            if(flag==false && nums[slow]==nums[fast]){ 
                flag = true;
                slow++;
                nums[slow] = nums[fast];
                while(fast < nums.length && nums[slow] == nums[fast]){   // while incrementing fast check if fast is still less than nums.length
                    fast++;
                }
            }
            else{
                flag = false;
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
        }
        return slow+1;
    }
}
