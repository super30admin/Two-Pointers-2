/*
TIME COMPLEXITY : O(m+n) where m is the number of rows and n is col
SPACE COMPLEXITY : O(1)
DID THIS CODE SUCCESSFULLY RUN ON LEETCODE : Yes
THREE LINE EXPLANATION OF SOLUTION IN PLAIN ENGLISH

I compare with last element to keep going to a matching row and then increment
my low pointer and decrment my high pointer acc to the value, if found return
else increase the row. If it is less than first element of next row not found.
return false


YOUR CODE HERE ALONG WITH COMMENTS EXPLAINING YOUR APPROACH


*/


class Solution {
    public int removeDuplicates(int[] nums) {
        int current = 0;

        int next = 0;

        int currEl = nums[current];

        int count = 0;

        while(next < nums.length){

            count = 0;

            currEl = nums[next];

            while(next < nums.length && nums[next] == currEl){
                count++;
                next++;
            }

            count = Math.min(count,2);

            while(count > 0 && current < nums.length){
                nums[current++] = currEl;
                count--;
            }

        }

        return current;
    }
}
