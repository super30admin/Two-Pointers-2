# 80. Remove Duplicates from Sorted Array II
# O(n) O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0 or nums == None: 
            return 0
        slow = 1
        count = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[i]
                slow+=1
        return slow
        
# 88. Merge Sorted Array
# O(n) O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        #start from last index
        last = m + n -1

        #start mergeing from reverse
        while m > 0 and n > 0:
            if nums1[m - 1] > nums2[n - 1]:
                nums1[last] = nums1[m - 1]
                m-=1
            else:
                nums1[last] = nums2[n -1]
                n-=1
            last-=1

        # append last remaining elements of nums2
        while n > 0:
            nums1[last] = nums2[n - 1]
            last-=1
            n-=1


# 240. Search a 2D Matrix II
# O(mn) O(1) 
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or not matrix[0]:
            return False

        # Start from the top-right corner
        row, col = 0, len(matrix[0]) - 1

        while row < len(matrix) and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] > target:
                col -= 1  # Move left
            else:
                row += 1  # Move down

        return False
