

#Solution 1:
#TC:O(n^2)
#SC:O(1)
#Here I am iterating through matrix and returning true if I find the target value.
#Solution1:
class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                print(matrix[i][j])
                if matrix[i][j]==target:
                    return True
        return False
    
#Solution 2:
#TC:O(m+n)
#SC:O(1)    
#Here I am checking if the target is greater or lesser than the matrix[row ][col], if its is higher, then I increment col pointer else I decrement the row pointer.
#Hence I return True if I find the target. 
class Solution:
   
    def searchMatrix(self, matrix, target):
        if matrix:
            row,col,width=len(matrix)-1,0,len(matrix[0])
            while row>=0 and col<width:
                if matrix[row][col]==target:
                    return True
                elif matrix[row][col]>target:
                    row=row-1
                else:
                    col=col+1
            return False
