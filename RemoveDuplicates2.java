/*
    Leetcode problem 80: Remove Duplicates from Sorted Array II
    T.C: O(n) :: S.C: O(1)

    Solved using Two Pointers solution: We can set a limiter to point only 2 indices
    at most for each unique element. If the the occurrence of an element is more than
    2 then the limit pointer stops moving until it receives a new element, henceforth
    the the new element is placed at limiter and then incremented. Repeat this to remove
    duplicates from the array (In this problem 2 duplicates are allowed hence 2 indices).
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0);

        int n = nums.length;
        int limit = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) { // i == 0 || can be included if looping from 0
                count = 1;
            } else {
                count++;
            }
            
            if (count <= 2) { //here k == 2
                nums[limit] = nums[i];
                limit++;
            }
        }

        return limit;
    }
}