//In this problem, we are starting from the top right corner of the matrix and comparing the current element with the target. 
// If the current element is not equal to the target and is greater than the target we move left if its less than the target we move down. We continue this process until we find the target or go out of bounds of the matrix.
//Time Complexity: O(m + n)
//Space Complexity: O(1)

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val m = matrix.size
        val n = matrix[0].size

        var i = 0
        var j = n - 1

        while(i < m && j >= 0) {
            if(matrix[i][j] == target) return true
            else if(matrix[i][j] > target) {
                j--
            }else {
                i++
            }
        }
        return false
    }
}