# Time Complexity : O(N)
# Space Complexity : O{1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No



    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m,n = len(matrix),len(matrix[0])

        r,c = 0,n-1

        while r<m and c>=0:
            if matrix[r][c]==target:
                return True
            elif matrix[r][c]<target:
                r+=1
            else:
                c-=1


        return False