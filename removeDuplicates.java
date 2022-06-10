// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.Arrays;

class Main {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        // slow pointer for maintaing the element that are less than 2
        int slow = 1;
        // for maintaing the count;
        // here I am starting with 1 as I am traversing array from 1st index
        int count = 1;
        // i is fast pointer
        for (int i = 1; i < n; i++) {
            // if current element is equal to previous element I am incresing the count
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                // else I am resetting the count to 1
                count = 1;
            }
            if (count <= 2) {
                // if count less than or equal to 2 I am over writing the element with current
                // fast pointer element.
                nums[slow++] = nums[i];
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
        System.out.println(removeDuplicates(nums) + " " + Arrays.toString(nums));
    }
}