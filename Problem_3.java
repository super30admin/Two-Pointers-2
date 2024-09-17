
public class Problem_3 {
	
public boolean searchMatrix(int[][] matrix, int target) {
        
        
        if(matrix == null || matrix.length == 0){
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = m - 1;
        int col = 0;
        
        while(row >= 0 && col <= n -1){
            
            if(matrix[row][col] == target){
                return true;
            }
            
            if(matrix[row][col] > target){
                row--;
            }else{
                col++;
            }
        }
        
        return false;
    }

}
