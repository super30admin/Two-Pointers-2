#Time Complexity : nlogn
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        
            row, col =   len(matrix)-1, 0        # <-- start at corner

            while row >=0 and col <= len(matrix[0])-1:  
                cell = matrix[row][col]

                if cell > target:               # <-- go up 
                    row-= 1
                elif cell < target:             # <-- go right
                    col+= 1
                else: return True               # <-- target found

            return  False