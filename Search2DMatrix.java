public class Search2DMatrix {
    // Idea is to eliminate the rows and columns based on the corner element
    // and eventually look for the element at the next possible position
    
    //Time Complexity: O(m+n)
    //space complexity: O(1)
        public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length-1;
        int cols = matrix[0].length-1;
        int i=0;
        int j=cols;
        while(i<=rows&j>=0){
        
        if(matrix[i][j]<target){
            i++;
        }
         else if(matrix[i][j]>target)
          {
              j--;
          }
            else
            {
               
            return true;
            }
        }
        return false;
        
    }
}
