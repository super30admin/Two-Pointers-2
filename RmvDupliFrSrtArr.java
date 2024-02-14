//Time Complexity = O(n)
//Space Complexity = O(1)
// Does it run on LeetCode successfully? : Yes
// Any difficulties:

/*
Traversing Matrix Diagonally: Leetcode 80: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

Two Pointer Approach : Fast & Slow Pointers

*/

public class RmvDupliFrSrtArr {

    public int removeDuplicates(int[] nums) {
        if(nums == null) return 0;
        if(nums.length == 1) return 1;
        int slow=0;
        int fast=0;
        int count=0;
        int n = nums.length;

        for(int i=0; i<n; i++){

        }

        return slow;
    }


    public static void main(String[] args) {
        RmvDupliFrSrtArr obj = new RmvDupliFrSrtArr();
        int[] nums = new int[] {};
        obj.removeDuplicates(nums);
    }
}