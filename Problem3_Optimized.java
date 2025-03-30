/*
Steps

1. Use two pointers:
 - 'i': to iterate through the array.
 - 'j': to track the position of the next valid element to be written.
2. Use a 'count' variable to track how many times the current number has appeared.
3. If the current number is the same as the previous one, increment 'count'.
    - If'count>2', skipwriting the number.
4. If the current number is differnt , reset 'count = 1'.
5. Write the current number to 'nums[j]' if 'count<=2', the increment 'j'.
6. Continue this until the end of the array.
7. Return 'j' as the new length of the array.





 */

class problem3_Optimized{
    public int removeDuplicates(int[] nums){

        //Edge case: if array is empty return 0
        if(nums.length == 0){
            return 0;
        }

        int i = 1;//Pointer to iterate through the array atarting from index 1
        int j=1; //Pointer to track the index where the next valid element should be
        int count = 1;//Tracks number of occurences of the current number


        //loop through the arraystarting from index 1
        while(i<nums.length){
            //if the current number is same as the previous one
            if(nums[i] == nums[i-1]){
                count++; //Increment count
                if(count>2){
                    i++; //Skip this duplicate (more than 2 occurences)
                    continue;//Move to next element without writing
                }

            }else{
                count = 1; //Reset count for new number
            }

            //Write the valid element to index j
            nums[j] = nums[i];

            //Move both pointers forward
            j++; //Move write pointer to next position
            i++; //Move read pointer to next element
        }

        //Return the new valid length of the array
        return j;
    }
}