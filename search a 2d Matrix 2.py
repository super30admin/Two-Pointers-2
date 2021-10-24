# TC-O(m+n)
# SC-O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n=len(matrix)
        m=len(matrix[0])
        # binary search
        # lowa=0
        # higha=m-1
        # for i in range(n):
        #     low=lowa
        #     high=higha
        #     while(low<=high):
        #         mid=int(low+((high-low)//2))
        #         j=int(mid%m)
        #         print(matrix[i][j])
        #         if(matrix[i][j]==target):
        #             return True
        #         else:
        #             if matrix[i][j] < target:
        #                 low=mid+1
        #             else:
        #                 high=mid-1
        #     lowa=lowa+m
        #     higha=higha+m
        # return False
        i=0
        j=m-1
        while(i<n and  j >=0):
            if matrix[i][j]==target:
                return True
            elif matrix[i][j] < target:
                i=i+1
            else:
                j=j-1
        return False