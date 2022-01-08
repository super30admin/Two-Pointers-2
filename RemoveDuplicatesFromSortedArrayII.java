class Solution {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    //Approach - Keep two pointers, one for iterating the entire array and another that points to the next insertion pos.
    //Keep counting the elements, when counter is less than equal to 2, add element to the arr in parallel.
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) {
            return 1;
        }
        int counter = 1;
        int index = 1;
        int j = 1;
        int n = nums.length;

        while(j < n) {
            if(nums[j] == nums[j-1]) {
                counter++;
            } else {
                //this is a new element
                counter = 1;
            }

            if(counter <= 2) {
                nums[index] = nums[j];
                index++;
            }
            j++;
        }
        return index;
    }
}