'''

Time Complexity : O(n^2)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No issues faced

Your code here along with comments explaining your approach:
Traverse thru the matrix using two pointers and dynamically update the pointers such that search becomes narrowed and quicker
'''

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i = 0
        j = 0
        right = len(matrix[0])
        down = len(matrix)

        while i < down:
            while j < right:
                if matrix[i][j] == target:
                    return True
                    break
                else:
                    if matrix[i][j] < target:
                        j += 1
                    else:
                        right = j
                        if matrix[i][j] > target and i == 0:
                            break
            j = 0
            i += 1
        return False