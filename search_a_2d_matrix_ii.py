'''
S30 Problem:

The logic of the problem lies in the use case, when you pick the last element in the first row
then you are making sure that, the previous elements in the row, always less then the current element
and the next elements in the column are always greater than that.
'''


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        rows = len(matrix)
        cols = len(matrix[0])

        r,c = 0,len(matrix[0])-1

        while(r>=0 and r<rows and c>=0 and c<cols):
            if target == matrix[r][c]:
                return True
            elif(target>matrix[r][c]):
                r+=1
            else:
                c-=1

        return False


