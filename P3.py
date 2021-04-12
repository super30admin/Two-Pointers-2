# -*- coding: utf-8 -*-
"""
Created on Mon Apr 12 12:04:38 2021

@author: jgdch
"""

#Time complexity: O(M+N)
#Space compleixty: O(1)
#All leetcode testcases passed

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix)
        n=len(matrix[0])
        i=0
        j=n-1
        while(i<m and j>=0):
           
            if(target<matrix[i][j]):
                j-=1
            elif(target==matrix[i][j]):
                return True
            else:
                i+=1
        return False