//Optimal solution
//Time complexity for the solution is O(m + n) and space complexity is O(1)
class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix.length == 0)
      return false;
    int m= matrix.length; int n= matrix[0].length;
    int i =0;
    int r=0,c=n-1;
    while(i< m+n && c>=0 && r<=m-1){
      if(matrix[r][c] == target)
        return true;
      else if(matrix[r][c] > target)
        c--;
      else if(matrix[r][c] < target)
        r++;
      i++;
    }
    return false;

  }
}

//Bruteforce solution
//Time complexity for the solution is O(n*n) and space complexity is O(1)
class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[i].length;j++){
        if(matrix[i][j] == target)
          return true;
      }
    }
    return false;
  }
}