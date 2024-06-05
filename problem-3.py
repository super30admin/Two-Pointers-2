# Time Complexity
# O(n+m)
# Space Complexity
# O(1)


# Approach :

# start at the index arr[0][columns-1]
# if the target is less than arr[0][columns-1], move left
# if the target is greater than arr[0][columns-1], move down
# keep comparing till the target is reached
# else return false

class Solution:
    def searchMatrix(self, arr: List[List[int]], target: int) -> bool:

        if not arr:
            return False

        rows = len(arr)
        cols = len(arr[0])
        j = 0
        row = 0
        col = cols-1

        while (row <= rows-1 and col >= 0):
            if arr[row][col] == target:
                return True

            elif arr[row][col] > target:
                col = col-1

            else:
                row = row+1

        return False
