public class Search2DMatrixII {

    // Time Complexity : O(m+n) worst case when we start from top-right and end at bottom-left element
// Space Complexity :
// Did this code successfully run on Leetcode :
//problems faced  : No

    /**
     * The approach is to use the sorted property. We prune O(m) or O(n) elements when looking at a particular value.
     * So, basically, all the elements below any value are greater than the current value.
     * Therefore, if the current value is greater than the target, then all values below current value will also be greater than target.
     * So, we decrease col pointer and skip that column. Similarly, we do it for the rows.
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;
        while(i>=0 && j >=0 && i< m && j < n)
        {
            int start = matrix[i][j];
            if(start < target)
                i++;
            else if( start > target)
                j--;
            else
                return true;
        }
        return false;
    }
}
