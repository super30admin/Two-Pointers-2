//time complexity:O(log n)
//space complexity:O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length;
        int m=matrix.length;
        int i=0;//pointer at the first row 
        int j=n-1;//pointer at the last top column 
        while(j>=0 && i<m)
        {
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]<target) // if the element is 
                //less than target
                i++;//increment the row as the target
            //will be below as it contains greater numbers
            else
                j--;//else decrement the row as it will contain 
            //elements with smaller values. 
        }
        return false;
    }
}
