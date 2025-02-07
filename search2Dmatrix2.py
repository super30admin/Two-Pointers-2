class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # bottom left search approach
        # start from bottom left cornor
        # if ele > target => element is in right direction
        # if ele < target => element is up

        rows = len(matrix)
        cols = len(matrix[0])

        r = rows-1
        c = 0

        while (c < cols and r >= 0):
            cur = matrix[r][c]

            if cur > target:
                # move up
                r -= 1
            elif cur < target:
                # move right
                c += 1
            else:
                # found the target
                return True
            
        
        return False

# TC: O(r+c)
# SC: O(1)