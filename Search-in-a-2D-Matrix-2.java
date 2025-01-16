## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true


This Problem can be solved in 3 different ways
1. BruteGorce: Using 2 loops
    Time Complexity : O(n2)
    Space Complexity : O(1)
2. Using Binary Search : As every row and column are sorted we caqn apply binary search on rows or columns
    Time Complexity : O(m logn) or O(n log m)
    Space Complexity : O(1)
3. 2 pointer - In this we will start either from first row last column or last row first column
    Lets consider we start from last row first column  
    if target is smaller we will move up and if target is greater we will move right. By doing this we will just move m+n steps in any case
    Time Complexity: O(m+n)
    Space Complexity: O(1)
//Approach 3
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //base condition
        if(matrix==null || matrix.length==0){
            return false;
        }
        //Initialised row and column
        int row=matrix.length-1;
        int col=0;
        //While loop with condition thet row and column ara in given scope. If found we will return true else we will rwturn false
        while(row>=0 && row<=matrix.length-1 && col>=0 && col < matrix[0].length){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col] > target){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
}