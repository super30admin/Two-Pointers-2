## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

// Time Complexity : 0(n) because the code iterates over the array only once.
// Space Complexity : 0(1) because the code only uses a fixed amount of additional memory, irrespective of the size of the input array.
// Did this code successfully run on Leetcode : Yes


class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int j = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                count++;
            }
            else {
                count = 1;
            }
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}



## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

// Time Complexity : 0(m+n) because we are traversing through both arrays exactly once to merge them into nums1.
// Space Complexity : 0(1) since we are only using a constant amount of extra space to store the pointers p1, p2, and p3.
// Did this code successfully run on Leetcode : Yes

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null && nums2 == null) {
            return;
        }

        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            }
            else {
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }
        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}



## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

// Time Complexity : 0(m+n) because we traverse through all rows and columns of the matrix
// Space Complexity : 0(1) because we are not using any extra space other than the variables row, col, m and n.
// Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int row = m - 1;
        int col = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] == target) {
                return true;
            }
            else if (target > matrix[row][col]) {
                col++;
            }
            else {
                row--;
            }
        }
        return false;
    }
}
