
// Time Complexity : O(m*nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english: here i did binary search on each row to find target

// Your code here along with comments explaining your approach


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean found=false;
        for(int i=0;i<m;i++){
            found   = doBinarySearch(matrix,i,n,target);
            if(found == true){
                return found;
            }
        }
        return found;
    }
   private boolean doBinarySearch(int[][] matrix,int row,int n,int target){
    int low=0;
    int high=n-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(matrix[row][mid] == target){
              return true;
        }else if(matrix[row][mid]  > target){
            high=mid-1;
        }else{
            low=mid+1;
        }
    }
    return false;
   }
}

// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english: here i followed bottom to top approach like i started searching from last adn first coloumn if matrix[m-1][0] is greater than target
// then i decrement row otherwise increment
// Your code here along with comments explaining your approach

// solution-2: starting from last row and 0th column

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int row = m-1;
        int col = 0; 
        while(row >=0 && col <= n-1){
            if(matrix[row][col] == target){
                return true;
            }else{
                if(matrix[row][col] > target){
                    row--;
                }else{
                    col++;
                }
            }
        }
        return false;
   }
}


// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english: here i followed  top to bottom approach like i started searching from last column && first row if matrix[0][n-1] is greater than target
// then i decrement col otherwise row
// Your code here along with comments explaining your approach

// solution-2: starting from first row and (n-1)th column
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int row =0 ;
        int col = n-1; 
        while(row <= m-1 && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }else{
                if(matrix[row][col] > target){
                    col--;
                }else{
                    row++;
                }
            }
        }
        return false;
   }
}