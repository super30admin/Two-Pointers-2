# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

# TC O(n) SC O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        i, c, n = 1, 1, len(nums)
        while i < len(nums):
            if i == len(nums)-1:
                if c == 2 and nums[i] == nums[i-1]:
                    nums.pop()            
            elif nums[i] != nums[i-1]:
                c = 1
            elif c == 2 and nums[i] == nums[i-1]:
                nums[i:len(nums)-1] = nums[i+1:len(nums)]
                nums.pop()
                i -= 1
            elif nums[i] == nums[i-1]:
                c += 1
            #print(nums, "c =", c, "i =", i)
            i += 1
            
## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

# TC = O(n) SC O(1)
class Solution:
    def merge(self, nums1, m, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i,j,l = 0,0, len(nums1)
        while i < l:
            if i < m and j < n:
                if nums2[j] < nums1[i]:
                    arr = nums1[i:l-1]
                    nums1[i] = nums2[j]
                    nums1[i+1:] = arr
                    i += 1
                    j += 1
                    m += 1
                    print(nums1)
                else:
                    i += 1
               
            elif j < n:
                nums1[i] = nums2[j]
                i += 1
                j += 1
            
            else: break

## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
# TC O(N) SC O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m, n = len(matrix)-1, len(matrix[0])-1
        curr = 0
        while curr <= m:
            if matrix[curr][0] <= target <= matrix[curr][n]:    
                l = 0
                r = n
                #print(l, r, f)
                while l <= r:
                    mid = (l+r) // 2
                    if matrix[curr][mid] == target:
                        return True
                    if matrix[curr][mid] > target:
                        r = mid-1
                    else:
                        l = mid+1              
            curr += 1



