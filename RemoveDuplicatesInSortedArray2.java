// Approach: Maintain two pointers, i and j, where i iterates through the array and j tracks the position of the final array
// containing elements that satisfy the given constraint. Copy the element at index i to index j only if it is not the same as the
// element at index j-2. Elements at j-1 and j-2 can be the same, as at most two duplicates are allowed.
// Time Complexity: O(n) where n - array size
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

import java.util.Arrays;

public class RemoveDuplicatesInSortedArray2 {

    int removeDuplicates(int[] arr) {
        if (arr.length == 1) {
            return arr.length;
        }

        int j = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[j - 2]) {
                arr[j++] = arr[i];
            }
        }

        // Replacing remaining elements of array with -1
        for (int i = j; i < arr.length; i++) {
            arr[i] = -1;
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicatesInSortedArray2 rdsa2 = new RemoveDuplicatesInSortedArray2();
        int[] arr = { 0,0,0,1,1,1,1,2,3,3 };
        System.out.println("Array length after removing > 2 duplicates: " + rdsa2.removeDuplicates(arr)); // prints 7
        System.out.println("Array after removing > 2 duplicates: " + Arrays.toString(arr)); // prints 0,0,1,1,2,3,3,_,_,_
    }
}