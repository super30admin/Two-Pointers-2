class Solution:
    def searchMatrix(self, matrix, target):
        #edge case
        if len(matrix)==0:
            return False
        m=len(matrix)
        n=len(matrix[0])
        i=0
        j=n-1
        #traversing through array
        while i<m and j>=0:
            #condition where target is found
            if matrix[i][j]==target:
                return True
            #condition for column change
            elif matrix[i][j]>target:
                j-=1;
            else:
                i+=1
        return False
#Time-Complexity: O(m+n)
#Space-Complexity:O(1)