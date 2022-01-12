# Time Complexity :
# O(m+n)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
# Yes

# Three line explanation of solution in plain english

# I have started iterating form the element which is at first row and last col.

# If element is equal to target return true

# If element is smaller then target i incremented the row as all the elements in this row before this element
# are smaller than the element itself - in this way i eleminated an entire row

# If the element is greater then the target i decremented the col as all the elements in this col after this element
# are greater than the element itself - in this way i eleminated an entire col

# Your code here along with comments explaining your approach

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        if(matrix == None or len(matrix) == 0):
            return False
        
        
        i = 0
        j = len(matrix[0])-1
        
        while(i<=len(matrix)-1 and j>=0):
            if(matrix[i][j] == target):
                return True
            elif(matrix[i][j]>target):
                j-=1
            else:
                i+=1
        
        return False