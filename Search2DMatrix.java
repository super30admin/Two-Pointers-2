// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Starting from either top right or bottom left! We go either
// down or left when starting from top right, left if the current element is greater than target else down.

class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n-1;

        while(i<m && j>=0){
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] < target) i++;
            else j--;
        }
        return false;
    }

    public static void main(String [] args){
        int [][] matrix = new int[][]{{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{
        18, 21, 23, 26, 30}};
        Search2DMatrix s = new Search2DMatrix();
        System.out.println(s.searchMatrix(matrix, 5));
    }
}