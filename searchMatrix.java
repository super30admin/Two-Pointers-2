class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //define the pointers at the bottom left 
        int row  = matrix.length -1;
        int column = 0;
        
        while(row >= 0 && column < matrix[0].length) {
            
             // if the element is more then the target decrement the row
            if(target < matrix[row][column]) {
                row--;
            }
            // if the element is less then the target decrement the column
            else if(target > matrix[row][column]) {
                column++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}