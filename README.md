# Two-Pointers-2

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:-

// Traverse the array with a single pointer to track unique values up to 2 times. 
// Maintain a count of duplicates and reset it whenever a new number is found. 
// Overwrite elements beyond two occurrences in-place and return the new length.

// Your code here along with comments explaining your approach

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int pt1 = 1;
        int count = 1;

        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[pt1] = nums[i];
                pt1++;
            }
        }

        return pt1;
    }
}

## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english:-
// Start comparing from the end of both arrays, and place the larger value at the end of nums1. 
// Decrease the pointer of the array from which the value was taken. 
// If nums2 has leftover elements, copy them into nums1.


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0){
            return;
        }

        int p1 = m-1, p2 = n-1, p3 = m+n-1;

        while(p1>=0 && p2>=0){
            nums1[p3] = Math.max(nums1[p1], nums2[p2]);//check which element is bigger and place that at the p3
            p3--;

            if(nums1[p1] < nums2[p2]){//if p1 was lesser than we will decrease p2 bcz we placed p2 element at p3 
                p2--;
            }

            else{ if p1 was greater than we will decrease p1 as we placed p1 element at p3
                p1--;
            }
        }

        while (p2 >= 0) {//we will add the remaining element in the nums1 array from nums2
            nums1[p3--] = nums2[p2--];
        }
    }
}
## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)


// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english:-
// Start from the top-right of the matrix and compare the target with the current element. 
// Move left if the target is smaller, or move down if the target is larger. 
// Repeat until the target is found or the indices go out of bounds.

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }

        int m = matrix.length - 1;
        int n = matrix[0].length-1;

        int row = 0;
        int col = n;

        //Starting from top right
        while(row <= m && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }

            else if(target > matrix[row][col]){
                row++;
            }

            else{
                col--;
            }
        }

        return false;
    }
}

