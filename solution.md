# Problem 1
## Time Complexity :
O(n+m)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
Yes.
## Any problem you faced while coding this :
No. 

## Your code here along with comments explaining your approach
### Solution:

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #Initializing pointers
        ptr1=m-1
        ptr2=n-1
        i=m+n-1
        #Checking condition: Ptr1 & Ptr2 should be greater than or equal to 0
        while(ptr1>=0 and ptr2>=0):
            # Checking case
            if(nums1[ptr1]>nums2[ptr2]):
                nums1[i]=nums1[ptr1]
                ptr1-=1
            else:
                nums1[i]=nums2[ptr2]
                ptr2-=1
            i-=1

# Problem 2
## Time Complexity :
O(n)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
Yes.
## Any problem you faced while coding this :
No. 

## Your code here along with comments explaining your approach
### Solution:

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #Edge Case
        if len(nums)==0:
            return nums
        #Initializing pointers
        slow=0
        fast=1
        flag=False
        #Case1
        if nums[slow]==nums[fast]:
            flag = True
            slow+=1
            nums[slow]=nums[fast]
            fast+=1
        #Case2
        if flag==True:
            while(nums[fast]==nums[fast-1]):
                fast+=1
        #Case3
        if nums[slow]!=nums[fast]:
            flag=False
            slow+=1
            nums[slow]=nums[fast]
            fast+=1
        
 # Problem 3
## Time Complexity :
O(m+n)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
Yes.
## Any problem you faced while coding this :
No. 

## Your code here along with comments explaining your approach
### Solution:

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix and matrix[0]:
            m,n = len(matrix), len(matrix[0])
            #Initializing row and col
            i, j = 0, n-1
            #Condition
            while i<m and j>=0:   
                if matrix[i][j] == target:
                    return True
                elif matrix[i][j] < target:
                    i += 1
                else:
                    j -= 1
        return False
