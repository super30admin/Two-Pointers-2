
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

//we will have a fast and slow pointer. The slow pointer will move forward until we have covered numbers less than
//duplicate limit. We will move the fast pointer to find the next number and skip over the duplicates and move them to
//the slow pointer when we find a new number. By the time fast pointer is at the end, the slow pointer will be at end of
//array without duplicates.

// Your code here along with comments explaining your approach

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int counter = 1;

        int slow = 1;

        //loop is fast pointer
        for(int i = 1; i < nums.length; i++){
            //keep moving if duplicate
            if(nums[i] == nums[i - 1]){
                counter++;
            }
            else{
                counter = 1;
            }
            //add if under duplicate limit or new number
            if(counter <= 2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;

    }
}