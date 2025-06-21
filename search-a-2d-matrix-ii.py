#Brute force
#iterate through each row/col and apply binary search at each one.
#Time Complexity:O(m log n) for row based binary search, O(n log m) for col based binary search
#Space Complexity:O(1)

# #row based binary search
# class Solution:
#     def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
#         m = len(matrix)
#         n = len(matrix[0])
#         for i in range(m):
#             low, high = 0, n - 1
#             while low <= high:
#                 mid = low + (high - low) // 2
#                 if matrix[i][mid] == target:
#                     return True
#                 elif matrix[i][mid] < target:
#                     low = mid + 1
#                 else:
#                     high = mid - 1
#         return False

    # #col based
    # def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
    #     m = len(matrix)
    #     n = len(matrix[0])
    #     for i in range(n):
    #         low, high = 0, m - 1
    #         while low <= high:
    #             mid = low + (high - low) // 2
    #             if matrix[mid][i] == target:
    #                 return True
    #             elif matrix[mid][i] < target:
    #                 low = mid + 1
    #             else:
    #                 high = mid - 1
    #     return False

# #Approach2.1:
# #Start from the top-right corner of the matrix. If the number is bigger, move left; if smaller, move down. Keep checking until you find the target or exit the matrix bounds.
# #Time Complexity:O(m + n)
# #Space Complexity:O(1)
# class Solution:
#     def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
#         m = len(matrix)
#         n = len(matrix[0])
#         r, c = 0, n - 1
#         while r < m and c >= 0:
#             if matrix[r][c] == target:
#                 return True
#             elif matrix[r][c] > target:
#                 c -= 1
#             else:
#                 r += 1
#         return False

#Approach2.2:
#Start from the bottom-left corner of the matrix. If the number is bigger, move up; if it's smaller, move right. Keep going until you find the target or run out of bounds.
#Time Complexity:O(m + n)
#Space Complexity:O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        r, c = m - 1, 0
        while r >= 0 and c < n:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                r -= 1
            else:
                c += 1
        return False
