// ## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Take two pointers slow and fast and compare the values at the pointer location. Iterate over the array starting from the third element (index 2) using the fast pointer. Compare the element at the slow - 2 index (two positions behind the slow pointer) with the element at the fast index. If the elements are not equal, it means it's a new number that is not a duplicate. So, assign the value at the fast index to the position indicated by the slow pointer, and increment the slow pointer by one. Finally return the slow pointer.

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3)
            return nums.length;

        int slow = 2;

        for (int fast = 2; fast < nums.length; fast++) {
            if (nums[slow - 2] != nums[fast])
                nums[slow++] = nums[fast];
        }
        System.out.println("Array at ouput" + Arrays.toString(nums));
        return slow;
    }

    public static void main(String[] args) {
        int[] input = { 1, 1, 1, 2, 2, 3 };
        RemoveDuplicatesSortedArray obj = new RemoveDuplicatesSortedArray();
        System.out.println("Index where duplicates are removed: " + obj.removeDuplicates(input));

    }
}