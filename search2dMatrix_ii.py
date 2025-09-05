'''
We either start with Top-right corner or bottom left corner. 
Because, on these two corners I can make a definitive judgement of picking one 
side. i.e
    - if I start from top right,
        - if target>nums[curr] go down
        - else go left
    - if I start from bottom left,
        - if target>nums[curr] go right
        - else go up
Time complexity: O(m+n) 
Space Complexity: O(1)
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        # start the search at top right corner
        find_row = 0
        find_col = n-1

        while 0<=find_row<=m-1 and 0<=find_col<=n-1:
            if matrix[find_row][find_col]==target: # target found
                return True
            elif matrix[find_row][find_col]>target:
                # go left
                find_col-=1
            else:
                # go down
                find_row+=1
        
        return False