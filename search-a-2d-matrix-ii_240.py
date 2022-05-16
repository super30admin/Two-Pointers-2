#Time Complexity O(MN) One pass for traversing matrix array using row column pointers
#Space Complexity O(1)
#It successfully runs on the leetcode

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix: return
        r= len(matrix)-1
        c= len(matrix[0])-1
        i = 0
        j = c
        while i<=r and j>=0:
            if matrix[i][j]==target: return True
            if matrix[i][j] > target:
                j-=1
            else:
                i+=1
        return False
        