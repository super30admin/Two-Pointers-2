#Time Complexity: O(m + n)
#Space Complexity : O(1)
#Did your code run on leetcode: yes

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        
        i = 0
        #used last element in first row for making decisions of where to move pointers
        j = n - 1
        
        while(i < m and j >= 0):
            if(matrix[i][j] == target): return True
            elif(matrix[i][j] > target):
                j -=1
            else:
                i +=1
                
        return False
        
