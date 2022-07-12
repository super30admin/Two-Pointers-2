// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution {

    public int[] removeElement(int[] arr, int index) {

        //Move all the elements one position to the left to overwrite
        for (int i = index + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        return arr;
    }

    public int removeDuplicates(int[] nums) {
        int i = 1, count = 1, length = nums.length;

        while (i < length) {

            if (nums[i] == nums[i - 1]) {

                count++;

                if (count > 2) {

                    this.removeElement(nums, i);
                    i--;
                    length--;
                }
            } else {
                count = 1;
            }
            i++;
        }

        return length;
    }
}
        



