class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        #either start at topright or bottomleft corner
        #we have end two conditions as value should oppose on both ways
        #ex. from 15 , check value smaller than 15 (target=5), so traverse previous column to reduce instaed of going to next row as it performs reverse function of increasing value, which is wrong.
        #likewise choose either column or row traversal and reach particular value
        #O(m+n), need to traverse either sides
        #O(1) in place
        
        
        
        #topright corner
        i=0
        j=len(matrix[0])-1
        if matrix:
            #while boundary conditions fulfilled
            while i<=len(matrix)-1 and j>=0:
                #if target is less than value, go to previous column
                if target<matrix[i][j]:
                    j-=1
                #found, >>return
                elif target==matrix[i][j]:
                    return True
                #if target is more than value, go to next row
                else:
                    i+=1
            return False
            