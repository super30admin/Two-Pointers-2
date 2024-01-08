
// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yess
// Three line explanation of solution in plain english: As column and row are in sorted order we searh element fron top right corner and increment decrement according to the target.

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        int row=0;
        int column=n-1;
       
    while(row<m && column>=0){
        int current= matrix[row][column];
        if(current==target){
            return true;

        }
        if(current>target){
            column--;
        }
        else{
            row++;
        }
    }
    return false;
    }
}