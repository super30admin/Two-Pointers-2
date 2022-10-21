# TC: O(log(size of matrix))
# SC: O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows=len(matrix)
        cols=len(matrix[0])
        
        left,right=0,rows*cols-1
        
        while left<=right:
            mid=(left+right)//2
            mid_element=matrix[mid//cols][mid%cols]
            if target==mid_element:
                return True
            else:
                if target<mid_element:
                    right=mid-1
                else:
                    left=mid+1
        return False