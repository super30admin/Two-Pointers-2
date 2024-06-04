// Time Complexity : O(n) as we iterate over all the elements of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes. Faced difficulty to figure out when to swap elements
/*
Approach: Used 2 pointer technique and initialized a pointer starting from 1st element(j) which is used to hold the index to place the next valid value. And for loop with i pointer is used to explore all the elements.
We simply compare if i equals to less than i-1 then we increment the counter or else reset the count value to 1. Till the value of count is <= 2 in the nums[j] we refill with nums[i] and increment the j pointer
 */
class Solution {
    public int removeDuplicates(int[] nums) {

        int count = 1;
        int j =1;
        for(int i = 1; i < nums.length; i++){

            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }

            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
    }

    private void swapElements(int[] nums, int currentIndex, int newIndex) {
        int temp = nums[currentIndex];
        nums[currentIndex] = nums[newIndex];
        nums[newIndex] = temp;
    }
}