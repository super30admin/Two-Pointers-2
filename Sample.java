
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//Problem 1:

//t.c --> o(n)
//s.c --> o(1)

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;
        int j = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count < 3) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

// problem 2

// T.C O(M+N)
// S.C O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (nums1 == null || nums1.length == 0)
            return;
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int i = m + n - 1;

        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] > nums2[ptr2]) {
                nums1[i] = nums1[ptr1];
                ptr1--;
            } else {
                nums1[i] = nums2[ptr2];
                ptr2--;
            }

            i--;
        }

        while (ptr2 >= 0) {
            nums1[i] = nums2[ptr2];
            ptr2--;
            i--;
        }

    }
}

// problem 3

// T.C (m*n)log(m*n)
// S.C O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0, high = m * n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2; // to prevent integer overflow
            int r = mid / n;
            int c = mid % n;

            if (matrix[r][c] == target) {
                return true;
            } else if (target < matrix[r][c]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return false;
    }
}