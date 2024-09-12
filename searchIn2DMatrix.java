/*
1. In a Brute force approach I would iterate over the 2d matrix, check element at each cell. if I find element I would just return true from there.
2. if I reach the end of the nested for loop without returning, I will return false from there.
Time Complexity - O(mn) where m is number of rows and n is number of columns.
Space complexity - O(1)

----Optimized Approach-----
1. Elements in each rows are sorted in ascending order from left to right.
and each columns are sorted in ascending order from top to bottom.
2. I would be using this information for searching an element.
3. I would be starting my search from upper right corner which is 1st row last col
4. if that element is less than target then i would increase my row index as columns are sorted in ascending order from top to bottom.
5. if element at current cell is greater than target i am decreasing the col index as rows are sorted in ascending order from top to bottom.
Time Complexity - O(m+n)
Space complexity - O(1)
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //edge case
        if(matrix.length == 0 || matrix[0].length==0)
            return false;
        
        int r = matrix.length;
        int c = matrix[0].length;
        int row= 0, col= c-1; 
        while(row < r && col>=0 ){
            if(matrix[row][col] == target)
                return true;
            //increase col index as columns are sorted in ascending order
            else if(matrix[row][col] < target)
                row++;
            else
                col--;
        }
        return false;
    }
}
