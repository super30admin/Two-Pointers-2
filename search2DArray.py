 def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = 0
        col = len(matrix[0]) -1
        while(row<= len(matrix)-1 and col>=0):
            if(target == matrix[row][col]):
                return True
            elif(target > matrix[row][col]):
                row = row+1
            else:
                col = col -1
                
        return False

