/*
Approach: Remove Duplicates from Sorted Array II
1. Use 2 pointers:
 -'i': to iterate through the array
 -'j': to track the position of the next valid element to be written.
2. Use a 'count' variable to track how many times the current number has appeared.
3. If the ci=urrent number is same as the previous number increment 'count'.
-If 'count>2', skip writing this number.
4. if current number is same as the previous one increment 'count'.
5. Write the current number to 'nums[j]' if 'count<=2', then increment 'j'.
6. Continue this till the end of the array.
7. Return 'j' as the new length of the array.

 */

public class Problem1 {
    public int removeDuplicates(int[] nums){
        //Edge case: If array is empty, return 0
        if(nums.length == 0){
            return 0;
        }

        int i=0; //Pointer to iterate through the array starting from index 1
        int j=0; //Pointer to track the index where the next vzlid element should go
        int count = 1; //Tracks number of occurences of the current number

        //loop through the arrray strating from index 1
        while(i<nums.length){
            //If current number is same as previous one
            if(nums[i] == nums[i-1]){
                count++;//Increment count
                if(count>2){
                    i++; //Skip this duplicate (more than 2 occurences)
                    continue; //Move to next element without writing
                }
            } else{
                count =1; //Reset count for new numbers
            }

            //Write valid elements to index j
            nums[j] = nums[i];

            //Move bothb pointers forward
            j++; //Move write pointer to next position
            i++; //Move read pointer to next element
        }

        //Return the new valid length of the array
        return j;

    }
}
