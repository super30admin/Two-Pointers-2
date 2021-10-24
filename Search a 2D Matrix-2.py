class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row=0
        col=len(matrix[0])-1
        while(row<len(matrix) and col>=0):
            if(target<matrix[row][col]):
                col-=1
            elif(target>matrix[row][col]):
                row+=1
            else:
                return True
        return False

# Time complexity: O(n+m)
# Space complexity: O(1)