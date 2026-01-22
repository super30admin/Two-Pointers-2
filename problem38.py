class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #here ful 2D matrix is not sorted. Only rows are sorted.
        #so can't consider as a 1-D array.
        #we use steps method O(m+n)
        #can do BS on rows O(m*logn)
        #can do BS on column O(n*logm)
        #brute force is O(m*n)
        
        #in steps method start from top right or bottom left cell.
        #other two corners we can't make a decision in which way to proceed as both sides will be either smaller or greater

        #starting from top right corner here

        m = len(matrix)
        n = len(matrix[0])

        #right most corner, for left bottom take accordingly
        row = 0
        col = n-1

        while 0 <= row < m and 0 <= col < n:
            if target == matrix[row][col]:
                return True
            elif target > matrix[row][col]:
                row += 1
            else:
                col -= 1

        return False

        # Time Complexity: O(m+n)
        # Space Complexity : O(1)