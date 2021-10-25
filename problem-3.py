#Time Complexity :O(m+n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : yes
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
#Initialize from last column of first row
        row = 0
        col = len(matrix[0])-1        

        while(row<len(matrix) and col>=0):
#If element is greater than target, search by decrementing column 
            if matrix[row][col] > target:
                col -= 1
#If element is smaller, search by incrementing row
            elif matrix[row][col] < target:
                row += 1
#If target found, return true
            else:
                return True
        return False