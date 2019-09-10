//Time complexity O(n)
//Space complexity O(1)
//Ran on leetcode and accepted
public class Solution {
    public boolean circularArrayLoop(int[] nums) {
        //Set flag to false initially 
        boolean flag = false;
        //Iterate over the array
        for ( int i=0; i<nums.length; i++ ) {
            //Initialize a slow pointer to keep track of the original path
            Integer s = i;
            //Initialise Fast pointer such that it points to the next step of the slow pointer
            Integer f = next(nums, 0, i);
            //store the value at i to keep trak of direction
            int dir = nums[i];
            //as long as slow pointer , fast pointer is not null and slow pointer and fast pointer does not meet be in loop
            while ( s != null && f != null && s != f ) {
                //Calculate slow pointer recirsively 
                s = next(nums, dir, s);
                //calculate fast pointer recursively 
                f = next(nums, dir, next(nums, dir, f));
            }
            //If slow is not null and fast meets slow pointer
            if ( s != null && s == f ) {
                //Set flag to true as it is a loop
                flag = true;
                //Break
                break;
            }
        }
        //Return flag indicating there is/isnt a loop.
        return flag;
    }
    //Function to get the Next position 
    Integer next(int[] nums, int dir, Integer pos) {
        //If the current position is null 
        if ( pos == null ) return null; // null, return null
        if ( dir * nums[pos] < 0 ) return null; //If there is a change in direction, return null
        //Calculate the next position by adding the value of pos to index pos and take the modulo of using length of nums as it is a circular array
        Integer next = (pos + nums[pos]) % nums.length;
        //If the next position is negetive then add it to the length of nums as it is circular array to get the index
        if ( next < 0 ) next += nums.length; // wrap negative
        //if the next index and pos is same 
        if ( next == pos ) next = null; // self-pointer, return null
        //Return the next index
        return next;
    }
}