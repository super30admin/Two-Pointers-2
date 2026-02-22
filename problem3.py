# problem 3 

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        left_index = m-1
        right_index = 0
        while(left_index>=0 and right_index<n):
            if matrix[left_index][right_index] == target:
                return True
            elif matrix[left_index][right_index] > target:
                left_index-=1
            else:
                right_index+=1
        return False
