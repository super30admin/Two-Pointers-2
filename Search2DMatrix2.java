package TwoPointers2;
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int i = 0, j = n;
        while(i<=m && j>=0){
            if(matrix[i][j]==target)
                return true;
            if(matrix[i][j]<target){
                i++;
            } else{
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Search2DMatrix2().searchMatrix(new int[][]{{1,4},{2,5}}, 5));
    }
}
