

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes

// I am using a two-pointer approach where slow pointer keeps track of the position to insert unique elements
// and fast pointer is used to explore the array. I am also keeping a count of duplicates and allowing at most 2 duplicates.

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0,fast=0,count=0,k=2;
        while(fast<nums.length){
            if(fast!=0&&nums[fast]==nums[fast-1])
                count++;
            else
                count=1;                  //resetting the count for new element
            if(count<=k){
                nums[slow]=nums[fast];    
                slow++;
            }
            fast++;
        }
        return slow;
    }
}