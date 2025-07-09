# Time Complexity: O(m+n)
# Space Complexity: O(1)
# Were you able to run the code on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        m = len(matrix)
        n = len(matrix[0])


        # using two pointer approach starting from top right corner of matrix
        row = 0
        col = n-1

        # search for target by moving downwards if target is greater than current element 
        # else move left, return true if element is found else return false
        while row<=m-1 and col>=0:
            curr = matrix[row][col]
            if curr == target:
                return True

            elif curr > target:
                col-=1

            else:
                row+=1

        return False