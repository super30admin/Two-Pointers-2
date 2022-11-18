class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        ###################
        # TC - o(m+n)
        # SC -  o(1)
        ###################
        m = len(matrix)
        n = len(matrix[0])
        # base case
        if m == 0:
            return False
        # the aproach is to travel towards the direction of element 
        # start with right corner
        r = 0
        c = n - 1
        while(r<m and  c>=0):
            # print(r)
            if matrix[r][c] == target:
                return True
            elif target > matrix[r][c]:
                r= r + 1
            else:
                c = c - 1
        return False
