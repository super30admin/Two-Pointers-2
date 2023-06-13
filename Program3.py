#Time complexity is: O(m+n) where m and n are number of rows and column in the array
#Space complexity is: O(1)
#Program ran successfully on leet code
#No issues faced while coding the problem

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        #Taking initial poistion at top right corner
        c_row=0
        c_column=len(matrix[0])-1
        #Making sure that rows and column index values are between 0 and mac values
        while(c_row>=0 and c_row<len(matrix) and c_column>=0 and c_column<len(matrix[0])):
            #If the target value is equal to matrix poistion value we will return that
            if(target==matrix[c_row][c_column]):
                return True
            #If the target is less than matrix poistion values, we will move towards left in same row
            elif(target<matrix[c_row][c_column]):
                c_column-=1
            #Else we will move the next row of same column
            else:
                c_row+=1
        #If the value is not foi=und we will return false
        return False
