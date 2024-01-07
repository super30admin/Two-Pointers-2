
"""
240. Search a 2D Matrix II
Medium
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

 
Example 1:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true

Example 2:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false

 
Constraints:

m == matrix.length
n == matrix[i].length
1 <= n, m <= 300
-109 <= matrix[i][j] <= 109
All the integers in each row are sorted in ascending order.
All the integers in each column are sorted in ascending order.
-109 <= target <= 109


"""

class Solution:
    """
    Accepted
    Time Complexity :  O(m+n)
    Space Complexity : O(1)
    Did this code successfully run on Leetcode : Yes
    Memory: 50%
    Runtime: 5%
    
    Explanation: The intuition is to use the sorted property of the matrix. Start from the top right corner.
    If the target is greater than the current element, move down. If the target is less than the current element, move left.
    Until we find the target or we go out of bounds.
    """
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix) # rows
        n = len(matrix[0])
        i = 0
        j = n-1
        while i < m and j >= 0: 
            # Bounds. [V Imp] 
            # 1. Since we are moving down i.e increasing i, we need to check if i is less than m
            # 2. Since we are moving left i.e decreasing j, we need to check if j is greater than 0
            # A common mistake is to check for i < m and j < n. This will fail for [[1]] and 1
            if matrix[i][j] == target: 
                return True
            elif matrix[i][j] > target: # move left
                j -= 1
            else: # move down
                i += 1
        return False
    
    """
    Accepted
    Same Algorithm
    
    In this one I checked for the bounds in every condition and the outer loop was for m+n times.
    The other one is more clean
    """
    def searchMatrix2(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n - 1
        # print(i," ",j)
        for _ in range(m+n):
            if i<m and j>=0 and matrix[i][j] == target:
                return True
            elif i<m and j>=0 and matrix[i][j] > target:
                j -= 1
            elif i<m and j>=0 and matrix[i][j] < target:
                i += 1
        return False

LeetCode(PROBLEM, Solution).check()
