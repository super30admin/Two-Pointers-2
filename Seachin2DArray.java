
/*
time complexity: O(n), where is the number of elements as we traversing the array only once using 2 pointers
space complexity : O(1)


*/
class Seachin2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix == null){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        
        
        int i = 0;
        int j = n-1;
        
        while(i < m && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            
            if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
            
        }
        
        
        return false;
    }
}