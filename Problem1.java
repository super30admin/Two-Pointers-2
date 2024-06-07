/*
    LC - 80. Remove Duplicates from Sorted Array II
    TC - O(n)
    SC - O(1)
    Approach - Using Two Pointer Approach
        j -> holds the element where it needs to get overrided with the ith element if it is required
        i -> pointer which keeps traversing and calculate the count by checking the previous element.
            (first occurence of the element)

        also, we keep checks if the count is <=2 then swap the element. and increment j pointer.
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int j = 1; 
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            }
            else {
                count = 1;
            }
            if(count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}