'''
In this problem I took 2 pointers, where I started comparing the target value with the last element of first row.
Since the matrix is sorted in rows and columns, if the last element is greater than the target value i shifted the pointer to left in the same row.
if its smaller than the target value i moved to next row in the same column, until the target value is found.
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        row = 0
        col = n-1
        while row < m and col >= 0:
            if matrix[row][col] == target: return True
            if matrix[row][col] > target:
                col -= 1
            else:
                row += 1
        return False
'''
Time Complexity: O(m+n)
Since we iterate on number of cols(n) and number of rows(m), time taken taken will be O(m+n)
Space Complexity: O(1)
We did not take any extra spac, we just returned if the element exists or not
'''