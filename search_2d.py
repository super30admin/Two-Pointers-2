class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
#       TC--->O(m+n)
#       SC---->O(1)
        row=0
        column=len(matrix[0])-1
#         we are starting from the first row last element 
        while(row<len(matrix) and column>=0):
            if(matrix[row][column]>target):
                column=column-1
            elif(matrix[row][column]<target):
                row=row+1
            else:
                return True
        return False