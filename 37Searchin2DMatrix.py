"""
// Time Complexity :T = O(m+n) m = number of rows, n = number of columns
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NA

//Explanation:
AS the array is sorrted,use pointer either from top-right or left-botton only.
Can not use pointer from top-left or bottom-right because both adjacent
values are greater. Refer matrix in the problem.
Adjust pointer accordingly.
"""
class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        # edge case
        if matrix is None or len(matrix) == 0:
            return False

        # logic         
        m = len(matrix)
        n = len(matrix[0])
        r= 0
        c = n -1

        while(r < m and c >= 0 ):
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:  # value > target, reduce column
                c -= 1
            else:                          #value < target, increase row
                r += 1
        return False
"""
Use binary search.
T = O(m log n) m = number of rows, n = number of columns
S = O(1)
"""
"""
# brute force solution:
T = O(m*n) m = number of rows, n = number of columns
S = O(1)
class Solution:
    def searchMatrix(self, matrix, target):
      for r in range(len(matrix)):
        for c in range(len(matrix)):
          if matrix [r][c] == target:
            return True
      return False

if __name__ == "__main__":
  rows, columns = 5,5
  matrix = [[0 for i in range(columns)] for j in range(rows)]
  s = Solution()
  target = 17

  for r in range(len(matrix)):
    for c in range(len(matrix)):
      matrix[r][c] = input("Enter number")

  matrix[0][0] = 1
  matrix[0][1] = 4
  matrix[0][2] = 7
  matrix[0][3] = 11
  matrix[0][4] = 15

  matrix[1][0] = 2
  matrix[1][1] = 5
  matrix[1][2] = 8
  matrix[1][3] = 12
  matrix[1][4] = 19

  matrix[2][0] = 3
  matrix[2][1] = 6
  matrix[2][2] = 9
  matrix[2][3] = 16
  matrix[2][4] = 22

  matrix[3][0] = 10
  matrix[3][1] = 13
  matrix[3][2] = 14
  matrix[3][3] = 17
  matrix[3][4] = 24

  matrix[4][0] = 18
  matrix[4][1] = 21
  matrix[4][2] = 23
  matrix[4][3] = 26
  matrix[4][4] = 30
  # print(matrix)
  print(s.searchMatrix(matrix,target))
  """
