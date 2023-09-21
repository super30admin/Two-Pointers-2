class Solution {
    // TC: O(n) // SC: O(1)
    public int removeDuplicates(int[] nums) {
        int s = 0;
        int count = 1;
        for (int f = 1; f < nums.length; f++) {
            if (nums[f] == nums[f - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                s++;
                nums[s] = nums[f];
            }
        }
        return s + 1;
    }

    // TC: O(m+n) // SC: (1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int idx = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[idx] = nums1[p1];
                p1--;
            } else {
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }
        while (p2 >= 0) {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }

    // TC: O(m + n) SC: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

}