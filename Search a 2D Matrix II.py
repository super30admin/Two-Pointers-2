# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach

#brute force - nested for loop TC - O(m*n)

#binary search - TC - O(mlogn)

# two pointer/modified binary search- TC - O(m+n) ---> optimized (if ele < target go down, if ele > target go left)


def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
    if matrix == None or len(matrix) == 0:
        return False
    
    row = len(matrix)
    col = len(matrix[0])
    i = 0
    j = col-1
    while i<row and j>=0:
        if matrix[i][j] == target:
            return True
        elif matrix[i][j] > target:
            j -= 1
        else:
            i += 1
    return False