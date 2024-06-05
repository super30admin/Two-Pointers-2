
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Use two pointer ones to keep track of where to insert element and one to traverse the array.
// Use coiunter to keep track of occurance of elements
// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0){
            return -1;
        }
        
        int i,j = 1;
        int count = 1;

        for(i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i]){
                count++;
            }
            else(count>2){
                count = 1;
            }
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}