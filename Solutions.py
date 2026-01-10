Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
Time Complexity : O(n)
Space Complexity : O(1)

## we count the duplicates that are allowed
## if the count increases we replace and move the slow pointer

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        slow =1 
        count =1

        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                count+=1
            else:
                count =1
            if count <=2:
                nums[slow] = nums[i]
                slow +=1
        
        return slow
            


Problem2 (https://leetcode.com/problems/merge-sorted-array/)
Time Complexity : O(n)
Space Complexity : O(1)


## start filling nums1 from backwards
## how to fill check which one is bigger, fill with the bigger element and decrease the pointers
## Once completed check if anything remaining in p2, fill it without checking anything and decrease pointer
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2= n-1
        idx = m+n-1
        while p1>=0 and p2>=0:
            if nums1[p1] > nums2[p2]:
                nums1[idx] = nums1[p1]
                p1-=1

            else:
                nums1[idx] = nums2[p2]
                p2-=1
            idx-=1
        while p2>=0:
            nums1[idx] = nums2[p2]
            p2-=1
            idx-=1
        
            
            



Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
Time Complexity : O(n)
Space Complexity : O(1)

## I can start from the top right corner or bottom left to perform the steps
## check if cur == target return else move left or right



class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        def helper(i,j):
            
            ## base condition to exit
            if i<0 or i>=rows or j<0 or j>=cols:
                return False
            ## returning true if found
            if matrix[i][j] == target:
                return True

            ## moving left
            elif matrix[i][j] > target:
                return helper(i,j-1)
            ## moving right
            else:
                return helper(i+1,j)
        
        rows = len(matrix)
        cols = len(matrix[0])

        return helper(0,cols-1)


