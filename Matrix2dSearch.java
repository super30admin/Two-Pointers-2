class Matrix2dSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }

        int n = matrix.length, m=matrix[0].length;
        int rightPointer = 0;
        int upPointer = n-1;

        while (upPointer >=0 && rightPointer < m){
            if(matrix[upPointer][rightPointer] == target){
                return true;
            }

            if(matrix[upPointer][rightPointer] > target){
                upPointer--;
            }
            else if(matrix[upPointer][rightPointer] < target){
                rightPointer++;
            }
        }
        return false;
    }
}
