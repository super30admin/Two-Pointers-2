
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// We will implement this solution with fast and slow pointers

// fast and slow would start at the same index 0
// at each index of fast we will be keeping a count of the numbers
// if the count of the current number is <=2, fast would copy its value on slow and move slow 

class Solution {
    public int removeDuplicates(int[] nums) {
        int fast =0;
        int slow = 0;
        Integer prev = null;
        int count =0;
        while(fast < nums.length){

            if(prev == null || prev!=nums[fast]){
                count=0;
            }
            // increment the count
            count++;
            if(count<=2){
                // copy fast value at slow and increment slow
                nums[slow++] = nums[fast];
            }
            prev = nums[fast];
            fast++;
        }

        return slow;// in the first slow number of slots the items are placed
    }
}