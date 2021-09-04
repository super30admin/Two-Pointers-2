time complexity: O(m+n)
space complexity: O(1)

class Solution { //using two pointers
    public boolean searchMatrix(int[][] matrix, int target) {
       int m=matrix.length-1; //number of rows
    int n=matrix[0].length-1; //number of columns
 
    int i=m; //putting the pointer at first row last element since it is max
    int j=0;
 
    while(i>=0 && j<=n){ //traversing and searching 
        if(target < matrix[i][j]){
            i--;
        }else if(target > matrix[i][j]){
            j++;
        }else{
            return true; //if found return true
        }
    }
 
    return false;  //else false
    }
}