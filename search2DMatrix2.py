'''
Approaches:
1) Linear search - O(m*n) time to loop over the matrix
2) Reduced search space with clever traversal: - start with top right(0,n-1) index or
start with bottom left(m-1,0) index and from there increment/decrement i or j one step
at a time based on where the element might be. This is possible because all columns and all rows are
sorted in ascending order.
'''

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        if m == 0:
            return False
        n = len(matrix[0])
        
        i , j =  0, n-1
        print(i,j, m, n)
        while i < m and j >= 0:

            if matrix[i][j] > target:
                j -= 1
            elif matrix[i][j] < target:
                i += 1
            elif matrix[i][j] == target:
                return True
        return False