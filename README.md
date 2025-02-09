# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        slow =1
        count =1
        for fast in range(1,len(nums)):
            if nums[fast] == nums[fast -1]:
                count  +=1
            else:
                count =1
            if count <= 2:
                nums[slow] =nums[fast]
                slow +=1
        return slow


## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        idx = m+n-1
        while(p1>=0 and p2>=0):
            if(nums1[p1]>nums2[p2]):
                nums1[idx]=nums1[p1]
                p1 -=1
            else:
                nums1[idx]=nums2[p2]
                p2 -=1
            idx -=1
        while(p2>=0):
            nums1[idx] = nums2[p2]
            p2 -=1
            idx -=1


        

## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or not matrix[0]:
            return 0
        m = len(matrix)
        n = len(matrix[0])
        i =0
        j= n-1
        while (i<m and j>=0):
            if (matrix[i][j] == target):
                return True
            if (matrix[i][j] < target):
                i +=1
            else:
                j -=1
        return False
        
        
        

