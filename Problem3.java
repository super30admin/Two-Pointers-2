
public class Problem3 {
	//Time : O(m*n)
	//Space :O(1)
public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return false;
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        int r=0;
        int c=m-1;
        
        while(r<n && c>=0){
            if(matrix[r][c]==target){
                return true;
                
            }
            else if(matrix[r][c]>target){
                c--;
                
            }else{
                r++;
            }
        }
        return false;
    }
}
