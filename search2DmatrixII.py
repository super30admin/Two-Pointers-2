class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = 0
        col = len(matrix[0])-1
        while row<len(matrix) and col>=0:
            print(row,col)
            currentno=matrix[row][col]
            print(currentno)
            if currentno==target:
                return True
            elif currentno < target:
                row+=1
            else:
                col-=1
        return False
        