
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
    func searchMatrix(_ matrix: [[Int]], _ target: Int) -> Bool {
        if matrix.count == 0 {
            return false
        }
        var m = matrix.count
        var n = matrix[0].count 
        var row = 0
        var col = n - 1
        while row < m && col >= 0 {
            if matrix[row][col] > target {
                col -= 1
            } else if matrix[row][col] < target {
                row += 1
            } else {
                return true
            }
        }
        return false
    }