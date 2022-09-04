class Problem3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // null check
        if(matrix == null || matrix.length == 0) return false;
        int row = 0; int column = matrix[0].length-1;
        while(row <= matrix.length-1 && column >= 0){
            if(matrix[row][column] == target) return true;
            else if(matrix[row][column] < target){
                //move down
                row++;
            }
            else{
                //move left
                column--;
            }
        }
        return false;
    }
}