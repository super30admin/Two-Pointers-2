//Time Complexity: O(mn)
//Space Compelxity:O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            if(target>=matrix[i][0] && target<=matrix[i][n-1]){
                int j=0;
                while(j<n){
                    if(matrix[i][j]==target){
                        return true;
                    }
                    j++;
                }
            }
        }
        return false;
    }
}

//Time Complexity: O(m+n)
//Space Compelxity:O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[][] dirs=new int[][] {{1,0},{0,-1}};
        int m=matrix.length;
        int n=matrix[0].length;        
        int i=0,j=n-1;
        while((i>=0 && i<m) && (j>=0 && j<n)){
            if(matrix[i][j]==target){
                return true;
            }
            if(matrix[i][j]<target){
                i+=dirs[0][0];
                j+=dirs[0][1];
            }
            else{
                i+=dirs[1][0];
                j+=dirs[1][1];
            }
        }
        return false;
    }
}