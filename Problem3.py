#Search a 2D Matrix II

# Time complexity O(m+n) where m is rows and n is columns
# Space complexity -> O1
# Logic -> start from last row 1st column. based on the target comparison we can move up if target is lower than cuurrnt element if bigger move right
# keep on moving until you find element or you cross the matrix boundary which means target is not there

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        startRow = len(matrix)-1
        startColumn = 0
        maxColumns = len(matrix[0]) 

        while startRow>=0 and startColumn<maxColumns:
            # if current number is target return true
            currentItem = matrix[startRow][startColumn]
            if currentItem == target:
                return True

            #if target is smaller than current matrix move up because all other items in row will ve big
            if target < currentItem:
                startRow-=1
            
            #if target is greate than current matrix move right because all other items in column above will be smaller
            if target > currentItem:
                startColumn+=1
        
        return False

            