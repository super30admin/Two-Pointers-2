#https://leetcode.com/problems/search-a-2d-matrix-ii/
#time-o(nlogn)
#space-o(1)
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        def binarysearch(i,flag):
            if flag:
                low=i
                high=col-1
                while low<=high:
                    mid=low+(high-low)/2
                    if matrix[i][mid]==target:
                        return True
                    elif matrix[i][mid]<target:
                        low=mid+1
                    else:
                        high=mid-1
                return False
            else:
                low=i
                high=row-1
                while low<=high:
                    mid=low+(high-low)/2
                    if matrix[mid][i]==target:
                        return True
                    elif matrix[mid][i]<target:
                        low=mid+1
                    else:
                        high=mid-1
                return False
            
        row=len(matrix)
        col=len(matrix[0])
        print(row)
        print(col)
        for i in range(0,min(row,col)):
            case1=binarysearch(i,True)
            case2=binarysearch(i,False)
            if case1 or case2:
                return True
        return False