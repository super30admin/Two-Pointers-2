class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        # start with the top-right corner to start taking decision
        # start with bottom-left corner to start taking decision
        # on one side element increase, and other side element decrease.

        rows = len(matrix)
        cols = len(matrix[0])

        r = 0
        c = cols-1
        flag = False # default -- element doesn't exist

        while -1 < r < rows and -1 < c < cols:

            if target < matrix[r][c]:
                # go left -- col-1 position
                c = c - 1
            
            elif target > matrix[r][c]:
                # go bottom -- row+1 position
                r = r + 1
            
            else:
                # found the target
                flag = True
                break
        
        # end of while loop

        return flag