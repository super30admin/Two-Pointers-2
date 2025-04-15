# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes

def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        # pointer at 0th row and last column 
        # if number > target decrease the column
        # if number is smaller than target increase the row
        
        m = len(matrix)
        n = len(matrix[0])
        
        i = 0
        j = n-1
        while i>=0 and i<m and j>=0 and j<n:
            
            if matrix[i][j] == target:
                return True
            elif matrix[i][j]> target:
                j-=1
            else:
                i+=1
        return False 

