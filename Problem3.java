//time complexity : o(n+m);
//space complexity : o(1);
//Search a 2D Matrix II
class Problem3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0){
            return false;
        }
        
        int m=matrix.length;
        int n= matrix[0].length;
        int i=0;
        int j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target){
                i++;
            }else{
                j--;
            }   
        }
        
        return false;
    }
}