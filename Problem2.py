class Solution(object):
    # tc = O(n+m)
    # sc = O(1)  
    # ran successfully in leetcode
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        # brute force is to check every element which is O(m*n)
        # or in every row we can do the binary search and find the value then the complexity is O(mlogn)
        # or check in evry colum, O(nlogm)
        # trick part to narrow down at which row or at which col the value can be 
        # lets start from the top rigth corner value here i can compare two values move to left or down
        # if matrix[top][right] < target there is no point in moving to the left of the row as the row is sorted
        # from small to big so we move to the down we search in this col 
        # lets say we are searching for 17 in the matrix
        # we are starting from 15 -> down -> 19 -> left 12 -> down 16 -> down 17 found
        # if the val is greater than target move left, less than target move down, if equal found it 
        # when to stop when the top variable has reached till the len of rows and rigth variables has reached till 0 

        m = len(matrix)
        n = len(matrix[0])
        r = 0
        c = n -1

        if m == n == 1:
            return matrix[0][0] == target 


        while (r <= m-1 and c >= 0):
            if matrix[r][c] < target :
                r +=1
            elif matrix[r][c] > target:
                c -=1
            else:
                return True

        return False


