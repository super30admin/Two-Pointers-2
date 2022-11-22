#time complexity: O(m*n)
#space complexity: O(1)
#ran on leetcode: Yes
#start from the lower left corner, index n,0. 
#if current element is equal to target then return true
#if target is greater than current element, then move right ie j++
#if target is less than current element, then move upwards ie i-- 

class Solution:
    def searchMatrix(self, matrix, target: int) -> bool:
        i=len(matrix)-1
        j=0
        while(i>=0 and j<len(matrix[0])):
            if(target==matrix[i][j]):
                return True
            if(target<matrix[i][j]):
                i-=1
            else:
                j+=1
        return False
s=Solution()
matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target = 5
print(s.searchMatrix(matrix,target))