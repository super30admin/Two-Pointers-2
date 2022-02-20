// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Declare counter, pointer and prev
//We will take score of duplicates in counter
//We will incerement the pointer and keep replacing the element with the index of loop
//When the counter have value more than two then we don't increment pointer.
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int l = nums.length;
        int prev = nums[0];
        int p1 = 1;
        for(int i = 1; i < l; i++){
            if(nums[i] == prev){
                count++;
            }
            else{
                count = 1;
            }
            if(count > 2){
                continue;
            }
            prev = nums[i];
            nums[p1++] = nums[i];
        }
        return p1;
    }
}