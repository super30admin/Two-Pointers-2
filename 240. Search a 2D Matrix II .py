#Time: O(row + col)
#Space: O()
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row= len(matrix) -1
        col= len(matrix[0])-1
        r=0
        c=col
        while( r<=row and c>=0):
            if(target == matrix[r][c]):
                return True
            elif (target > matrix[r][c]):
                r = r+1
            elif(target < matrix[r][c]):
                c= c -1
            else:
                return False
        return False
        

        
