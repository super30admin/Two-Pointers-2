# problem 1 : 80. Remove Duplicates from Sorted Array II : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        loc = 1
        flag = 0
        for i in range(1, len(nums)):
            if flag:
                if nums[i] == nums[i-1]:
                    continue
                else:
                    nums[loc] = nums[i]
                    flag = 0
                    loc += 1
            else:
                if nums[i] == nums[i-1]:
                    flag = 1
                nums[loc] = nums[i]
                loc += 1
        return loc
                    



# problem 2 : 88. Merge Sorted Array : https://leetcode.com/problems/merge-sorted-array/
# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m - 1
        p2 = n - 1
        p = m + n - 1
        
        while p1 >= 0  and p2 >= 0:
            if nums1[p1] >= nums2[p2]:
                nums1[p] = nums1[p1]
                p -= 1
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p -= 1
                p2 -= 1
        nums1[:p2 + 1] = nums2[:p2 + 1]
        


# problem 3 : 240. Search a 2D Matrix II : https://leetcode.com/problems/search-a-2d-matrix-ii/
# Time Complexity : O(n+m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
    
        if not matrix:
            return False
        ### basic solution. 
#         def binary_search(data):
#             l,r = 0, len(data)-1
#             while l <= r:
#                 mid = ((r-l) // 2 + l)
#                 if data[mid] == target:
#                     return True
#                 elif data[mid] > target:
#                     r = mid -1
#                 else:
#                     l = mid +1
#             return False
        
#         rows, cols = len(matrix), len(matrix[0])
#         for i in range(rows):
#             if binary_search(matrix[i]):
#                 return True
#         return False

        rows, cols = len(matrix), len(matrix[0])
        i, j = rows-1, 0
        while i >= 0 and j <= cols -1:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                i -= 1
            else:
                j += 1
        return False
            
        
        