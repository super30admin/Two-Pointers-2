class SearchIn2dMatrix {


// Time Complexity : 0(m*n) where m is the no of rows and n is the no of columns
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: I started my solution with the rowpointer pointing to the lastrow and
    //1st column of the array. Then compared my target with that, if it is equal then i return true, else if the target is
    //greater then i move right in the matrix i.i increase my column by 1 and if the target is less, then i move up in the
    //matrix i.e. decrease my row by 1 until and unless i find the target.

// Your code here along with comments explaining your approach


    public boolean searchMatrix(int[][] matrix, int target) {
        int rowlength = matrix.length;
        int columnlength = matrix[0].length;
        int rowpointer = rowlength-1;
        int columnpointer = 0;
        while(rowpointer >= 0 && columnpointer < columnlength){
            if(matrix[rowpointer][columnpointer] == target){
                return true;
            }
            else if(target > matrix[rowpointer][columnpointer]){
                columnpointer++;
            }
            else{
                rowpointer--;
            }
        }
        return false;
    }
}