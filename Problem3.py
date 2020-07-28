#Two Pointers 2
#Problem1 : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
#All test cases passed on Leetcode
#Time Complexity-O(m+n)
#Space Complexity-O(1)

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        #edge case
        if len(matrix)==0:
            return false
        m=len(matrix)
        n=len(matrix[0])
        i=0
        j=n-1
        #starting from first row and  last column 
        while i<m and j>=0:
            #case1: if the element itself is the target
            #return True 
            if matrix[i][j]==target:
                return True
            #case 2: if the current value of matrix[i][j] is greater than target
            #decrement the column
            elif matrix[i][j]>target:
                j-=1
            #case 3:if the target is greater than value of matrix[i][j]
            else:
                i+=1
            #if still not found return False
        return False
sol = Solution()
matrix=[[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target=5
res=sol.searchMatrix(matrix,target)
print(res)



        
        















