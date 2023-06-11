// Time Complexity : O(m+n) as in the worst case we will have to traverse each element of the matrix once.
// Space Complexity :O(1) as no auxiliary data structure is used
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
// Your code here along with comments explaining your approach
class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null){
            return false;
        }

        int numberOfRows = matrix.length;
        int numberOfColumns = matrix[0].length;
        int rowIndex = 0;
        int columnIndex = numberOfColumns-1;

        while(rowIndex < numberOfRows && columnIndex >= 0){

            int current = matrix[rowIndex][columnIndex];

            if(current == target){
                return true;
            }
            if(current > target){
                columnIndex--;
            }else{
                rowIndex++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix2 obj = new Search2DMatrix2();
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 32;
        System.out.println(obj.searchMatrix(matrix, target));
    }
}