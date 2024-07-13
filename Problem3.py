#I iterated through each row of the matrix using a for loop. For each row, I checked if the target value is present using the in keyword. If I found the target in any row, I set the answer (ans) to True. After checking all rows, I returned the value of ans, which indicates whether the target was found in the matrix. This approach is easy to understand and implement, though it may not be the most efficient for large matrices. It ensures that I check every element in the matrix to see if it matches the target.


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ans = False
        for i in matrix:
            if target in i:
                ans = True
        return ans