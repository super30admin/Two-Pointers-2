#Start from Top right, if element is greater than target then move left as row is sorted ascending
#If element is smaller, move down as columns are also sorted ascending.
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row=len(matrix)
        column=len((matrix[0]))
        i=0
        j=column-1
        while (i>=0 and i<row) and (j>=0 and j<column):
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]>target:
                j=j-1
            else:
                i=i+1
        
        return False

