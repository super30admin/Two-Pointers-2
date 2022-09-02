//TC: O(m + n)
//SC: O(1)
//Program ran on leetcode successfully. 

class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int numR = matrix.length; 
        int numC = matrix[0].length;
        
        int i = 0; 
        int j = numC - 1;
        
        while (i < numR && j >= 0){
            if (matrix[i][j] == target){
                return true;
            }else if (matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
