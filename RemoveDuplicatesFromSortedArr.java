// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;
        int count = 1;
        while(fast<nums.length){
            if(nums[fast]==nums[fast-1]){
                count++;
            }else{
                count = 1;
            }
            if(count<=2){                
                slow++;
                nums[slow] = nums[fast];
                
            }
            
            fast++;
        }
        return slow+1;
    }
}