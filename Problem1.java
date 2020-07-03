/* Problem 1- Remove duplicates from Sorted Array II */

// Time Complexity : O(n) since we process each element  exactly once
// Space Complexity : O(1) in place algorithm and no extra space used
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// Your code here along with comments explaining your approach
// Here we will use in place approach with overriding duplicate values(more than two times)
// with non-duplicate value. we will use flag variable(set to false) to alter to true(if duplicate occurs)
// Case 1) Check if (slow pointer value equals to fast pointer value) and (flag == false), then set flag to true, increment slow and fast pointer, set slow value to fast value
// Case 1.1) nested case- if (flag == true), then check if(fast pointer value equals to fast-1 pointer value), then increment fast pointer
// Case 2) Check if (slow pointer value does not equal to fast pointer value), then set flag to false, increment slow and fast pointer, set slow value to fast value
// at the end, return slow+1 (determining final array length)

class Solution {
    public int removeDuplicates(int[] nums) {
        //Edge case
        if(nums == null || nums.length == 0) return 0;
        //initialise slow pointer to 0 and fast to slow+1
        int slow = 0;
        int fast = 1;
        //initialise flag variable to false - flag variable is used to alter its value to true if duplicate occurs
        boolean flag = false;
        //making sure index doesn't get out of bound for fast pointer
        while(fast < nums.length){
            //Case 1) checking if slow pointer value equals to fast pointer value
            if(nums[slow] == nums[fast]){
                // checking if flag is false
                if(!flag){
                    // alter flag to true since duplicate occurs
                    flag = true;
                    slow++;
                    nums[slow] = nums[fast];
                    fast++;
                } else {
                    //Case 1.1) checking if fast pointer value equals to fast-1(adjacent) pointer value
                    while(fast < nums.length && nums[fast] == nums[fast-1]){
                        fast++;
                    }
                }
            }
            //Case 2) checking if slow pointer value doesn't equal to fast pointer value 
            else {
                //alter flag to false since no duplicate occurs 
                flag = false;
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
        }
        //returning length of new array
        return slow+1;
    }
}
