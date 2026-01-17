/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}

**Intuition:**

The matrix is sorted in increasing order both row-wise and column-wise, so starting from the top-right corner gives a useful comparison point.
At this position, if the current value is equal to the target, we can return true. 

If the target is larger, we can safely move down because all values to the left are smaller; if the target is smaller, we move left because all values below are larger. By eliminating one row or one column at each step, we efficiently narrow the search space until the target is found or the indices go out of bounds.

If in this process our pointer are out of the matrix perimeter then we return false;

T.C: O(m+n)
S.C: O(1)


 */
var searchMatrix = function(matrix, target) {
    const rowLength = matrix.length, colLength = matrix[0].length;
    let currRow = 0, currCol = colLength - 1;
    // currRow >= 0 && currCol >= 0 && currRow < rowLength && currCol < colLength
    // above consition can be simplified into the below while condition
    while(currCol >= 0  && currRow < rowLength){
        const currVal = matrix[currRow][currCol];
     if(currVal === target){
        return true;
     }
     if(target > currVal){
        currRow = currRow + 1;
     }else{
        currCol = currCol - 1;
     }
    }

    return false;
    
};