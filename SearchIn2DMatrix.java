//time complexity : O(m+n)
//space complxity : O(1)
//leet code : successful
//steps : being search from first col last value at the bottom.
// and check with element of matrix with target. if it's > target increment col else decrement row.
//(coz each of row of matrix is sorted in asc order.)
class SearchIn2DMatrix{

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length-1, col=0;

        while(row>=0 && col < matrix[0].length){
            if(matrix[row][col]==target){
                return true;
            }
            else if (target > matrix[row][col]){
                col++;
            }else {
                row--;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int arr[][] = {{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        System.out.println(searchMatrix(arr, 6));
    }
}