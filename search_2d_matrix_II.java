// Time Complexity :O(m + n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix == null) return true;
    int m = matrix.length - 1;
    int n = matrix[0].length - 1;
    int i = 0, j = n;
    //i pointer is at the first element of the first row and j is at the first element of the last column
    //As we are reducing the search space, for the boundary elements there has to be a bounding condition
    //so the i and j don't go out of bounds
    while(i <= m && j>= 0){
        // if the element is found
        if(target == matrix[i][j]) return true;
        //if the target is less than the current element, we eliminate the column 
        else if(target < matrix[i][j]) j--; 
        else i++;
    }
    return false;
}