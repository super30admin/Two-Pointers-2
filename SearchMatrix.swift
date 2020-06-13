// Time Complexity : (O)m+n
// Space Complexity : (O)1
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes failed for test case [[-5]]-10, [[1,1]] 2. mistakenly taken m = matrix[0].count and n = matrix.count
//Search from top right since we can easily find in which direction we have to go. only tow options go left if number is smaller than the target else go bottom.

class Solution {
    func searchMatrix(_ matrix: [[Int]], _ target: Int) -> Bool {
       //edge
        if matrix.count == 0 {
            return false
        }
        var n = matrix[0].count
        var m = matrix.count
        
        var r = 0
        var c = n - 1
        while c >= 0 && r < m {
            if matrix[r][c] == target {
                return true
            } else if matrix[r][c] > target {
                c -= 1
            } else {
                r += 1
            }
        }
        
        return false
    }
}