"""240. Search a 2D Matrix II
Time Complexity - O(n+m)
Space Complexity - O(1)
starting from [0][no of column-1] of matrix
End condition for while loop will be i < no of rows and j >= 0
    if matrix[i][j] == Target
        return True
    elif matrix[i][j] < Target
        increment i as number is ascendingly increasing along column
    else
        increment j as number is ascendingly decreasing along row
No condition satisfies return False
    """
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix == None or len(matrix) == 0 or len(matrix[0]) == 0:
            return False
        n = len(matrix)
        m = len(matrix[0])
        
        i = 0
        j = m-1
        
        while(i < n and j >= 0):
            if (matrix[i][j] == target):
                return True
            elif matrix[i][j] < target:
                i += 1
            else:
                j -= 1
        return False
        