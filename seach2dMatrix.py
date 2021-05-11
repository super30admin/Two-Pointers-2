from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix is None or len(matrix[0]) == 0: return False

        rows = len(matrix) - 1
        column = len(matrix[0]) - 1
        cindex, rindex = column, 0
        while cindex >= 0 and rindex < rows:
            if matrix[rindex][cindex] == target:
                return True
            elif matrix[rindex][cindex] > target:
                cindex -= 1
            else:
                rindex += 1

        return False


#time:-O(n)
# space:-O(1)
















if __name__ == '__main__':
    print(Solution().searchMatrix(nums=[1,1,1,2,2,3],k=2))
