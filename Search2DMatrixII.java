class Search2DMatrixII {
    //Will traverse the matrix starting top right and will move row and cols
    //Tc will be O(m+n), as there are m rows and n columns.
    //SC will be O(1), as traversing through the given matrix
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0){
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n-1;

        while(row < m && col >=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(target > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }

        }
        return false;
    }

    public static void main(String[] args){
        Search2DMatrixII obj = new Search2DMatrixII();
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(obj.searchMatrix(matrix,target));
    }
}