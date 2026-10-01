# LEETCODE PROBLEM : 240. SEARCH A 2D MATRIX II
# TIME COMPLEXITY: O(row+col) as we are traversing the number of elements
# SPACE COMPLEXITY: O(1) a we are not using any exttra space to return the answer


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row=len(matrix)
        col=len(matrix[0])
        #starterVal=matrix[0][col-1]

        r=0
        c=col-1

        while r<row and c>=0:
            if matrix[r][c]==target:
                return True
            elif matrix[r][c]>target:
                c-=1
            else:
                r+=1
        return False
        
