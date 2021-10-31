# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
#Time Complexity=O(n)
#Space Complexity=O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j=1
        count=1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            if count<=2:
                nums[j]=nums[i]
                j+=1
        return j
        

## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
#Time Complexity=O(n+m)
#Space Complexity=O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1=m-1
        p2=n-1
        for p in range(n+m-1,-1,-1):
            if p2<0:
                break
            if p1>=0 and nums1[p1]>nums2[p2]:
                nums1[p]=nums1[p1]
                p1-=1
            else:
                nums1[p]=nums2[p2]
                p2-=1
    

## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
#Time Complexity=O(n*m)
#Space Complexity=O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row=len(matrix)-1
        col=0
        while row>=0 and col<=len(matrix[0])-1:
            if matrix[row][col]>target:
                row-=1
            elif matrix[row][col]<target:
                col+=1
            else:
                return True
        return False
                