// Time Complexity: O(m+n)
// Space Complexity: O(1)

class Solution3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;
        while( i < m && j >= 0) {
            if( matrix[i][j] == target ) {
                return true;
            } else if( matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}

// Binary search solution
// Time Complexity: O(mlogn)
// Space Complexity: O(1)
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         boolean bool = false;
//         int m = matrix.length;
//         int n = matrix[0].length;
//         for(int i = 0; i < matrix.length; i++) {
//             if( target >= matrix[i][0] && target <= matrix[i][n-1] ) {
//                 bool = binarySearch(matrix, i, target) || bool;
//                 if( bool ) {
//                     return true;
//                 }
//             }
//         }
//         return bool;
//     }

//     public boolean binarySearch(int[][] matrix, int row, int target) {
//         int left = 0;
//         int right = matrix[0].length -1;
//         while( left <= right ) {
//             int mid = left + (right-left)/2;
//             if( matrix[row][mid] == target) {
//                 return true;
//             } else if ( matrix[row][mid] < target) {
//                 left = mid+1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//         return false;
//     }
// }