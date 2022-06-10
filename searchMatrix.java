// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Main {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        // i will start checking from the bottom left corner
        int i = m - 1;
        int j = 0;
        // main logic
        while (i >= 0 && j < n) {
            // if my element is less than target that means all the elements in the left
            // side is less than current element so we are elemenating that elements.
            if (matrix[i][j] < target) {
                j++;
            } else if (matrix[i][j] > target) {
                // else our element is greater than target that means all the elements in the
                // bottom side is greater than the current element so we are elemenating that
                // elements.
                i--;
            } else {
                // if we found our target we return true
                return true;
            }
        }

        // if we have not found our element we return false;
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 }
        };
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }
}