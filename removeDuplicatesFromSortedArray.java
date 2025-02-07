// Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, two pointers approach is used. Declare a pointer slow at index 1 to keep elements without duplicates. Using for loop, traverse along
 * the array. Initially a count is initialized to 1, indicating the occurence atleast once, if found again at i-1 th place increase the counter.
 * else revert to 1. If count is lessthan or equal to 2 insert element at ith position at slow index. Finally return slow index which shows the 
 * length of the array without duplicates.
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 1;
        int count = 1;
        for(int i = 1; i<n;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
