
// Time Complexity : O(N) iterating array elements
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english:
//Use two pointers starting from index 2. This is because elements at index 0 and 1 are already in-place. 
//Then compare fast pointer with slow-2 element, if fast is greater than switch slow to become fast and increment fast and slow both, else only incrememnt fast.


// Your code here along with comments explaining your approach
// A brute force approach could be for each element in the array check it's number of occurance until i remains same.
//If i is more than 2 discard that element.
//Followed by same for all other elements.

class Solution {
    public int removeDuplicates(int[] nums) {
        //base checks
        if(nums == null || nums.length == 0) return 0;
        
        //initialize pointers
        int slow = 2, fast = 2;
        
        //iterate for the array to remove dups more than 2
        for(fast=2;fast<nums.length;fast++){
            if(nums[fast] > nums[slow-2]){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
        
    }
}
