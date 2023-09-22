// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//we can either start from first row last element or start from first col last element 
//there is pattern in number that number to its side is either small than curr or large than current
//if start from first row last element
//then if curr element>target =col-- move to left as to left is decreasing no
//else move down which is nothing but row++
// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0){
            return false;
        }
       int m=matrix.length;
       int n=matrix[0].length;
        int row=0;
        int col=n-1;
        while(row<m && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(target>matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}