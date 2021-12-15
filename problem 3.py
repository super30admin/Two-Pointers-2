# // Time Complexity :O(m+n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :YES

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix)-1
        n=len(matrix[0])-1
        row=m
        column=0
        # starting from first column last row move up if target small move right if target greater than finding element
        while(row>=0 and column <=n):
            if matrix[row][column]==target: #return if found
                return True
            elif target>matrix[row][column]:
                column+=1
            else:
                row-=1
        return False
            