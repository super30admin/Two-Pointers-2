"""
Leetcode - https://leetcode.com/problems/search-a-2d-matrix-ii/ (submitted)
TC- O(m + n), SC - O(1)
Lecture - https://youtu.be/kg8MORzM-LM
FAQ -
Other Technique? Binary search on each row that has our target in range.
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


'''
Intuition- 
If you start at top right or bottom right, you observe two unique directions -  one direction will give elements greater
than your current and other will give you smaller than your current. Use this intuition to find the target.
'''
class Solution:
    def searchMatrix(self, matrix, target):
        if matrix is None:
            return -1
        m = len(matrix)
        n = len(matrix[0])
        i, j = 0, n - 1
        while i <= m - 1 and j >= 0:
            if target == matrix[i][j]:
                return True
            # go left
            elif target > matrix[i][j]:
                i += 1
            # go down
            else:
                j -= 1

        return False



