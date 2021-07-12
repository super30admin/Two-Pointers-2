#Time:O(m+n)
#Space:O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        """
        Start from the top right corner and move left if the value is greater than target,
        move down if the value is less than target
        """
        m=len(matrix)
        n=len(matrix[0])
        i = 0
        j = n-1
        while(i>-1  and i<m and j>-1 and j<n):
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                j-=1
            else:
                i+=1
        return False