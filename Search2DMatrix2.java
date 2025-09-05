// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
//Approach: We can search the target either by starting from the bottom left or top right elements, why?
// because we can make a decision to move up or right (bottom left - elements decreasing on the right, decreasing upwards)
// or move down or move left (top right - elements decreasing on the left, increasing downwards)
// if current element is > target , we move up a row, else move to the next col
// if we find the element, return true, false otherwise
public class Search2DMatrix2 {

    /**
     *
     * @param matrix the matrix to search the target in
     * @param target the target element to search for
     * @return       true if target exists in the matrix, false otherwise
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int r = m - 1, c = 0;

        while (r >= 0 && c < n) {
            if (matrix[r][c] == target) return true;
            else if (matrix[r][c] < target) c++;
            else r--;
        }

        return false;
    }

    public static void main(String[] args) {
        final Search2DMatrix2 search2DMatrix2 = new Search2DMatrix2();
        System.out.println(search2DMatrix2.searchMatrix(new int[][] {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24}
        }, 22));

        System.out.println(search2DMatrix2.searchMatrix(new int[][] {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24}
        }, 7));

        System.out.println(search2DMatrix2.searchMatrix(new int[][] {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24}
        }, 18));
    }
}
