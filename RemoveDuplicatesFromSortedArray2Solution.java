// Time Complexity : O(n) //As we parse through whole array
// Space Complexity : O(1) No extra space is used, existing array only used to perform operation
// Did this code successfully run on Leetcode : Yes

import java.util.*;

public class RemoveDuplicatesFromSortedArray2Solution {
    public int[] removeDuplicates(int[] nums) {
        int count = 1, i = 1, j = 1;
        // i and j are two pointers, j remains and one position and i parses through the
        // array
        // if i is not repeated more than 2 two times, j will be replaced buy i and both
        // will be incremented
        // one step from their respective positions
        while (i < nums.length) {
            if (nums[i] == nums[i - 1]) { // if i is same as its previous element then increment the counter
                count++;
            } else { // If the element is its first ouccurance, then initiate the counter to 1
                count = 1;
            }

            // if the element is not repeated more than 2 times then replace it with i and
            // increment j
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }

            i++; // In all the cases incerment the first pointer i
        }

        int[] resultArray = Arrays.copyOfRange(nums, 0, j);
        return resultArray;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray2Solution rdfsas = new RemoveDuplicatesFromSortedArray2Solution();
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(rdfsas.removeDuplicates(nums)));
    }
}
