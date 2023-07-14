# // Time Complexity : O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# Here, we know each row and col is sorted. Upon close observation we can see that from top-right corner and bottom-left corner elements increase and decrease row and column vise (or vice versa). Essentially, we can make a decision on how to move.
# Thus, start at one of the 2 corners, if curr element>target, go in the direction of smaller elements, if curr element<target, go in the direction of bigger elements.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #Method 1 - Starting from Top-Right corner
        # m=len(matrix)
        # n=len(matrix[0])
        # r=0
        # c=n-1
        # while 0<=r<m and 0<=c<n:
        #     if matrix[r][c]==target:
        #         return True
        #     elif matrix[r][c]<target: #Current element is smaller than target, so go in the direction of bigger elements -> next row
        #         r+=1
        #     else:
        #         c-=1  #Current element is bigger than target, so go in the direction of smaller elements -> next col
        #Method 2 - Starting from Bottom-Left corner
        m=len(matrix)
        n=len(matrix[0])
        r=m-1
        c=0
        while 0<=r<m and 0<=c<n:
            if matrix[r][c]==target:
                return True
            elif matrix[r][c]>target:   #Current element is bigger than target, so go in the direction of smaller elements -> next row 
                r-=1
            else:               #Current element is smaller than target, so go in the direction of bigger elements -> next col
                c+=1 