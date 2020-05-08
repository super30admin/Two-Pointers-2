package com.ds.rani.twopointers;

/**
 * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * Example 1:
 * Given nums = [1,1,1,2,2,3],
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
 * It doesn't matter what you leave beyond the returned length.
 */

//Approach: Use to pointer approach, left will point to numbers first occurence and
// right will traverse over remaining occurences of the same number and count it.
//If count equal to 1 just copy left pinter number once else copy it twice
public class RemoveDuplicatesII {

    //Time complexity:o(n) where n is number of elements in an array
    //Space complexity:o(1) as I am doing it in place
    /**
     * @param nums sorted array with duplicate numberts
     * @return length of new array which will consist of at max 2 duplicate numbers for each diffrent number
     */
    public static int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int idx = 0;
        int left = 0;

        while (left < nums.length) {
            int right = left + 1;
            int count = 1;

            while (right < nums.length && nums[left] == nums[right]) {
                count++;
                right++;
            }
            //if one occurrence of a given number
            nums[idx++] = nums[left];

            // more than one occurrence of a given number
            if (count >1) {
                nums[idx++] = nums[left];
            }
            left = right;
        }

        return idx;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3};
        System.out.println( RemoveDuplicatesII.removeDuplicates( arr ) );
    }
}
