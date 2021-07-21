class SearchMatrix {
     //time:O(m+n)
    //space:O(1)
    //did it run successfully on leetcode: yes
    public boolean searchMatrix(int[][] matrix, int target) {
     
    //if matrix is null
      if(matrix.length == 0) return false;
    //storing length of rows and columns
      int m = matrix.length;

      int n = matrix[0].length;
    //initializing i and j variables
      int i = 0;

      int j = n -1;
    //until i is less than m and j is greater than or equal to zero
      while(i < m && j >=0){

          //case 1: if target found
            
          if(matrix[i][j] == target) return true;
        //if current element greater than target, decrease column
          else if(matrix[i][j] > target) j--;
          //if current element smaller than or equal to target, increase row
          else i++;

      }

      return false;
    }
}