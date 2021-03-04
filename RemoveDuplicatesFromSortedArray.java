// Since the array is sorted and you're allowed to have only two duplicates in the array, you can interate through the array
// and check whether the element at the current index is more than element at index - 2th index. If so then add that element to the array.

// Time Complexity : O(n)
// Space Complexity : O(1)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rArray = new RemoveDuplicatesFromSortedArray();
        List<int[]> inputs = new ArrayList<>();
        Collections.addAll(inputs, new int[] { 1, 1, 1, 2, 2, 3 }, new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 });

        for (int[] nums : inputs) {
            System.out.println(rArray.removeDuplicates(nums));
        }
    }
}