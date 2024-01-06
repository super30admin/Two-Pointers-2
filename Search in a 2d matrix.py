class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in matrix:
            r=len(matrix[0])-1
            l=0
            while l<=r:
                mid = (l+r)>>1
                if i[mid]==target:
                    return True
                elif i[mid]<target:
                    l=mid+1
                else:
                    r=mid-1
        return False
    
#Time complexity : O(n(log(n)))
#Space complexity : O(1)
