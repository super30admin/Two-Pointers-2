// Time Complexity : O(n), where n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * We keep two pointers, one for the slow index and one for the fast index.
 * We keep a count variable to keep track of the number of times a number has occurred.
 * If the count is less than or equal to k, we place the number at the slow index and increment the slow index.
 * If the count is greater than k, we increment the fast index.
 * We return the slow index.
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 0, count = 1;
        int k =2;

        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }

            if(count <= k){
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }
}