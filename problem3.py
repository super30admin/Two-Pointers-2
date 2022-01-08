class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i,j =len(matrix)-1,0
        #print(matrix,target)
        #diagonally transverse up, or right
        while i>=0 and j<len(matrix[0]):
            #print(i,j)
            if matrix[i][j]>target:
                i-=1
            elif matrix[i][j]<target:
                j+=1
            
            
            else:
                return True
        return False

#Time complexity O(m+n) since worst case scenarion n steps right, m steps up, last element of first row
#Space complexity O(1)  use of iterate variables