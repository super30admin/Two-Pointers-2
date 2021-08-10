#leetcode Problem: 240
#Solution 1:
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n=len(matrix[0])
        for i in range(len(matrix)):
            if target>=matrix[i][0] and target<= matrix[i][n-1]:
                start=0
                end=n-1
                while start<=end:
                    mid=start+(end-start)//2
                    if matrix[i][mid]==target:
                        return True
                    elif target>matrix[i][mid]:
                        start=mid+1
                    else:
                        end=mid-1
        return False

#TC: O(m log n)
#SC: O(1)

#Solution 2
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix)
        n=len(matrix[0])
        i=m-1
        j=0
        while i>=0 and j<n:
            if matrix[i][j]==target:
                return True
            elif target>matrix[i][j]:
                j+=1
            else:
                i-=1
        return False

#TC: O(m+n)
#SC: O(1)