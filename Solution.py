'''
PROBLEM 1

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)

- Use 2 pointers, slow and start starting from index 1, keep a prev variable to keep track of previous element and a flag which decides if repeated numbers have a valid count or not
- if the fast points to the same element as prev, then we check if the flag is 0 or 1, if it is 0, it means we need to move to next number and we increment slow and turn the flag 1, if it is 1, we increment fast pointer
- if the element at fast pointer is not same as prev, we assign fast to prev and move both slow and fast pointer and turn the flag to 0


'''


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow=1
        fast=1
        prev=0
        flag=0
        
        while(fast<=len(nums)-1):
            print(slow)
            
            if nums[fast]==nums[prev]:
                if flag==0:
                    nums[slow]=nums[fast]
                    slow+=1
                    flag=1
                else:
                    fast+=1
            else:
                prev=fast
                nums[slow]=nums[fast]
                slow+=1
                fast+=1
                flag=0
        return slow


'''
PROBLEM 2

TIME COMPLEXITY: O(m+n)
SPACE COMPLEXITY: O(1)

- start from the back of the arrays where i points to back of nums1 and j points to back of nums2 and keep filling up the array nums1 that has extra space
- we will place the smaller element at back of nums1 and keep decrementing the pointers i and j accordingly
- we will copy the remaining elements if any in nums2 to nums1

'''

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # nums1 = [1,2,3,0,0,0], m = 3
        #              ^
        # nums2 = [2,5,6],       n = 3
                   # ^
        
        i=m-1
        j=n-1
        index=m+n-1
        while(i>=0 and j>=0):
            if nums1[i]>nums2[j]:
                nums1[index]= nums1[i]
                i-=1
                
            elif nums1[i]<nums2[j]:
                nums1[index]= nums2[j]
                j-=1
            else:
                nums1[index]= nums1[i]
                index-=1
                nums1[index]= nums2[j]
                i-=1
                j-=1
            index-=1
        while(j>=0):
            nums1[index]=nums2[j]
            j-=1
            index-=1
        
            
            


'''
PROBLEM 3

TIME COMPLEXITY: O(M+N)
SPACE COMPLEXITY: O(1)

- we start at the right upper corner if the matrix and move either left or down depending on of the current element is smaller or larger than the target
- the right corner gives us an advantage because the left side has smaller element than it and bottom has larger element than it
- every step we make takes us in the right direction until we reach the target

'''


class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if len(matrix)==0:
            return False
        
        i=0
        j=len(matrix[0])-1
        
        while(i<len(matrix) and j>=0):
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]>target:
                j-=1
            else:
                i+=1
        return False