# Time Complexity: O(m+n)
# Space Complexity: O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
      r, c = len(matrix) - 1, 0
      while r >= 0 and c <= len(matrix) - 1:
        if matrix[r][c] == target:
          return True
        elif matrix[r][c] > target: # larger than up a row
          r -= 1
        else: # smaller then move to the right
          c += 1
      return False
      
#BF: O(m*n)
      # for r in range(len(matrix)):
      #   for c in range(len(matrix[0])):
      #     if matrix[r][c] == target:
      #       return True
      # return False

      # O(m*logn)
      # Bsearch instead of loop
      # def bsearch(nums, target):
      #   l, r = 0, len(nums) - 1
      #   while l <= r:
      #     mid = l + ((r-l) // 2)
      #     m = nums[mid]
      #     if m == target:
      #       return True
      #     elif m < target:
      #       l = mid + 1
      #     else:
      #       r = mid - 1
      #   return False

      # for r in range(len(matrix)):
      #   exists = bsearch(matrix[r], target)
      #   if exists:
      #     return True

      # return False
      

      
      
