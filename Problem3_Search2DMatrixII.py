'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 240. Search a 2D Matrix II

# Write an efficient algorithm that searches for a target value in an m x n 
# integer matrix. The matrix has the following properties:
# - Integers in each row are sorted in ascending from left to right.
# - Integers in each column are sorted in ascending from top to bottom.

# https://leetcode.com/problems/search-a-2d-matrix-ii/

#-----------------
# Time Complexity: 
#-----------------
# O(M+N): Where N is no. of elements in input array

#------------------
# Space Complexity: 
#------------------
# O(1): No extra space for auxiliary data structure

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes

from typing import List
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        if m == 0:
            return False
        else:
            n = len(matrix[0])
            i = 0
            j = n-1
            while i<m and j>= 0:
                # print(f"i:{i}, j:{j}")
                if matrix[i][j] == target:
                    return True
                elif matrix[i][j] < target:
                    i+= 1 # Increase row
                else:
                    j -= 1 # Decrease column

        return False




obj = Solution()
print(obj.searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], 5))