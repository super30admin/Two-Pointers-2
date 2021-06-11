class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix)
        n=len(matrix[0])
        ptr1=0
        ptr2=m-1
        while ptr1<=n-1 and ptr2>=0:
            if matrix[ptr2][ptr1]==target:
                return True
            elif matrix[ptr2][ptr1]<target:
                ptr1+=1
            else:
                ptr2-=1
        return False
        # ptr1=n-1
        # ptr2=0
        # while ptr1>=0 and ptr2<=m-1:
        #     if matrix[ptr2][ptr1]==target:
        #         return True
        #     elif matrix[ptr2][ptr1]<target:
        #         ptr2+=1
        #     else:
        #         ptr1-=1
        # return False
    """Time complexity - O(m+n) in worst case
    space complexity-O(1)"""
        