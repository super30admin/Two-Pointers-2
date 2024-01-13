""" Explanation: We start with two pointers, n and m. n is the first index of the outer array and m is the last element of the inner array.
    In other words, we start the pointers at the first and the last element of the matrix. And then check in what range does the target
    fall for the two pointers and keep reducing the search space until we reach the target.
    Time Complexcity: O(m+n)
    Space Complexcity: O(1)
"""


class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        n=0
        m=len(matrix[0])-1
        
        while(n<len(matrix) and m>=0):
            if target<matrix[n][m]:
                m-=1
            elif target>matrix[n][m]:
                n+=1
            else:
                return True
        return False
        