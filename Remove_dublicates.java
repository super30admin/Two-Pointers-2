// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english-
/*
1. Use two pointers, slow and fast, to traverse the array.
2. Keep track of the count of consecutive duplicate elements.
3. Only keep elements that appear at most twice.
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        // if(nums.length==null) return -1;
        int slow = 1;
        // int fast = 1;
        int c = 1;

        for(int fast=1; fast<nums.length;fast++){
            if(nums[fast]==nums[fast-1]){
                c++;
            }else c=1;
            if(c<=2){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}