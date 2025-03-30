/*
Steps:-
1. Initialize a pointer 'i' to track the position of the next valid element(starts at index 1).
2. Initialize a counter 'count' to keep track of how many times the number has occured.
3. Loop through the array from index 1 to end.
    a. If the current element is the same as the previous, increment 'count'.
    b. If its new element, reset the count to 1.
4. If 'count' is less than or equal to 2, it is valid- copy it to index 'i' and increment 'i'.
5. After the loop, return 'i' as the lengthof the updated array.

This algorithm modifies the array in-place and ensures that each element appears atmost twice.

*/



class Solution {
    public int removeDuplicates(int[] nums) {
        //If the array is empty , return 0 because there is nothing to process
        if(nums.length == 0){
            return 0;
        }

        // i is the index where the next valid element will be placed
        //Start from 1 because the first element is always allowed
        int i=1;

        //count keeps track of how many times the current number has been seen consequently
        int count= 1;

        //Loop through the array starting from the second element
        for(int j=1; j<nums.length; j++){

            //If the current number is the same as the previous one, increment the count
            if(nums[j] == nums[j-1]){
                count++;
            } else{
                //if its a different number start the count to 1
                count =1;
            }

            //If the count is less than or equal to 2, we keep the element
            if (count <=2){
                //Place the valid number at index i and increment i
                nums[i++] = nums[j];

            }

            //If count>2, we skip this number (do nothing)

        }

        return i;
    }
}