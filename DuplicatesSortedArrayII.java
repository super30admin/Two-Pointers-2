
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
/*
Approach:
========
1. Use two pointer technique, where slow points to where to insert value and fast points to value to insert at slow
2. If values at slow and fast are equal, if flag is false, one more duplicate allowed, so now assign value at fast to slow and 
set flag to true.
3. If equal but flag is true, move fast pointer till no duplicate is found
4. If not equal, copy values at fast to slow and move fast pointer. Set flag to false as no duplicates in this case
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if( nums == null || nums.length == 0) return 0;
        
        int slow = 0, fast = 1; 
        
        boolean flag = false;
        while( fast < nums.length) {
           
            if( nums[slow] == nums[fast]) {        //duplicate found
                if(!flag) {                         //case 1 - flag is false
                    nums[++slow] = nums[fast++];    //copy element from fast to slow and set flag to true
                    flag  = true; 
                }
                else {                              // 2 duplicates already copied, so increment fast till duplicates aren't found
                    while(fast < nums.length && nums[fast] == nums[fast-1]) 
                        fast++;
                }
            }
            else {                          // values are not equal at slow and fast, so keep copying and set flag to false
                nums[++slow] = nums[fast++];
                flag = false;
            }
        }
        
        return slow+1;
    }
}