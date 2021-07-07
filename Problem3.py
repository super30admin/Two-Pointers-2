# Time Complexity : O(m + n) where m will be all elements in col and n will be all elements in last row in worst case
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

class Solution:
    def searchMatrix(self,matrix,target):
        if not matrix:
            return False 
        row ,col = 0, len(matrix[0])-1
        while row < len(matrix) and col >= 0:
            print(matrix[row][col])
            if matrix[row][col] == target:
                return True 
            elif matrix[row][col] > target:
                col -= 1 
            else:
                row += 1 
        return False
                

if __name__ == "__main__":
    s = Solution()
    matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
    target = 17
    res = s.searchMatrix(matrix,target)
    print(res)