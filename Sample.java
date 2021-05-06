import java.util.Arrays;

// Your code here along with comments explaining your approach
class Sample {
    private static int remove_duplicates(int[] nums) {
        // Time Complexity : O(n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Copy from one pointer to another when a value changes 2 blocks ahead
        int n = nums.length;
        int readPointer = 0;
        int writePointer = 0;
        while (readPointer < n) {
            // start writing 2 blocks before a change or the end of array
            if (readPointer >= n-2 || nums[readPointer] != nums[readPointer + 2]) {
                nums[writePointer] = nums[readPointer];
                writePointer += 1;
            }
            // keep moving until a change happens (2 blocks ahead)
            readPointer += 1;
        }
        return writePointer;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Time Complexity : O(m + n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Start from the right end, compare and move numbers to first array
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        // copy the highest number to the right end
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        // move the numbers remaining in 2nd array
        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    private static boolean search_2d_matrix(int[][] matrix, int target) {
        // Time Complexity : O(m + n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Start from top-right or bottom-left
        // from top-right: move left if target is smaller else down
        // from bottom-left: move right if target is larger else up

        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        // from top right, move left if target is smaller else down
        while (i >= 0 && i < m && j >= 0 && j < n) {
            if (matrix[i][j] < target) i++;
            else if (matrix[i][j] > target) j--;
            else return true;
        }
        // didn't find target if went out of bounds
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,4};
        System.out.println("Removed Duplicates: " + Arrays.toString(Arrays.copyOfRange(nums, 0, remove_duplicates(nums))));
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[] {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println("Merged Array: " + Arrays.toString(nums1));
        int[][] matrix = new int[][]{
            {1,   4,  7, 11, 15},
            {2,   5,  8, 12, 19},
            {3,   6,  9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}};
        System.out.println(search_2d_matrix(matrix, 5));
        System.out.println(search_2d_matrix(matrix, 20));
    }
}