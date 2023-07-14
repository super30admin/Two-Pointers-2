#Time: O(m+n)
#Space: O(1)
#Did the code run? yes
#issues faced: used 2 pointers for each dimension instead of one pointer to reduce space.
#Approach:
#start from last row's 1st element
#if an element is greater than target then move to its above row(reduce row)
#else traverse in that row until an element is greater than target(reduce column)
# now move 
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        nr, nc = len(matrix), len(matrix[0])
        r, c = nr - 1, 0
        while r >= 0 and c < nc:
            if matrix[r][c] > target:
                r-=1
            elif matrix[r][c] < target:
                c+=1
            else:
                return True
        return False