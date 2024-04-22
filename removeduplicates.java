// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        int count = 0;
        int k = 2;

        while(fast < nums.length){
            if(fast != 0 && nums[fast] == nums[fast - 1]){ //If the elem at fast is equal to the elem at fast - 1
                count++; //The count will increase as we want only 2 elem
            } else{
                count = 1; //Reset the counter for a new elem
            }
            if(count <= k){
                nums[slow] = nums[fast]; //Replaces everytime the value is less than 2
                slow++;
            }
            fast++;
        }
        return slow;
    }
}