// Time Complexity : O(m*n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
func searchMatrix(matrix [][]int, target int) bool {
    if len(matrix) == 0 {
        return false
    }
    
    m := len(matrix)
    n := len(matrix[0])
    
    r:= 0
    c:= n-1
    
    for r<m && c >=0{
        if target < matrix[r][c]{
            c-=1
        }else if target > matrix[r][c]{
            r+=1
        }else{
            return true
        }
    }
    
    return false
}
