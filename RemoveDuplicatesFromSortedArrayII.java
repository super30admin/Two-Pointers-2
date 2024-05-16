
// Time Complexity : O(arrayLength)
// Space Complexity : O(1) inplace
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        // we can have read and write pointer and a variable storing the count/frequency
        // each element can only appear two times only

        int maxFreq = 2;
        int freq  = 0;
        int write = 0;

        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i] == nums[i-1]){
                // if index is 0 then simply incement freq or else compare curent with current-1 element from array
                freq++;
            } else {
                // if number is not equal then simply reset freq to 1
                freq = 1;// reset
            }
            if(freq <= maxFreq){
                // replace numbers
                nums[write] = nums[i];
                write++;
            }
        }
        return write;
    }
}
