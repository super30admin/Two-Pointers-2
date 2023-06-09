#TC = O(m+n)
#SC = O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows , cols = len(matrix) , len(matrix[0])
        print("Rows:",rows ,"columns:",cols)
        rows -=1
        cols -=1
        row =0
        while row<=rows and cols>=0:
            if matrix[row][cols]==target:
                return True
            elif target<matrix[row][cols]:
                cols -=1
            else:
                row+=1
        return False