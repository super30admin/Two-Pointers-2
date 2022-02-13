#Time Complexity: O(m+n)
#Space Complexity: O(1)
#Leetcode: Yes

'''
Approach: Start from first row end column, move down if current element is smaller than target. Move
left is current element is greater than target. 
'''

class Solution:
    def searchMatrix(self, matrix, target):
        row, col = len(matrix), len(matrix[0])-1
        i,j = 0, col
        while(i<row and j>=0):
            if matrix[i][j] == target:
                return True
            elif matrix[i][j]<target:
                i+=1
            else:
                j-=1
        return False

obj = Solution()
matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target = 5
print(obj.searchMatrix(matrix,target))