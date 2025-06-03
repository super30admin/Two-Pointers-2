# Time Complexity : O(m+n)
# Space Complexity : O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix)
        n=len(matrix[0])
        ridx=m-1
        cidx=0

        while ridx >= 0 and cidx <= n-1:
            if matrix[ridx][cidx]==target:
                return True
            elif matrix[ridx][cidx] < target:
                cidx+=1
            else:
                ridx-=1
        
        return False