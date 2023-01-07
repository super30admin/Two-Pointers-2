# //Search a 2D Matrix II
# // Time Complexity : O(max(m,n))
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Three line explanation of solution in plain english
# // Using two pointers for row and column
# // Starting with either first row,last column position or last row and first column position
# // Incrementing column pointer if value is lesser than target else decremanting row 
# // Your code here along with comments explaining your approach
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        i = m-1
        j = 0
        while(i >= 0 and j < n):
            if(matrix[i][j] == target):
                return True
            elif (matrix[i][j] < target):
                j+=1
            else:
                i-=1
        return False

# Remove Duplicates from Sorted Array II
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Three line explanation of solution in plain english
# Counting number of occurences of element using count variable
# Adding k number of occurences of element using slow pointer/boundary pointer
# Resetting the count variable everytime new element is occured
# Your code here along with comments explaining your approach
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 1
        count = 0
        k = 2
        
        for i in range(1, len(nums)):
            if i == 1 and nums[i] == nums[i-1]:
                count+=2
            elif nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if(count) <= k:
                nums[slow] = nums[i]
                slow+=1
                
        return slow

# Merge Sorted Array
# Time Complexity : O(max(m,n))
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Three line explanation of solution in plain english
# Maintaning 3 pointers at the end of first array(non-zero element end), second array and first array
# Compare two pointers and add bigger elements at the end of first element
# If first array index goes out of bound add all elements of second array to first array
# If second array index goes out of bound it means all elements are sorted.
# Your code here along with comments explaining your approach
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        first = m-1
        second = n-1
        idx = m+n-1
        while(first>=0 and second>=0):
            if(nums1[first] >= nums2[second]):
                nums1[idx] = nums1[first]
                first-=1
            else:
                nums1[idx] = nums2[second]
                second-=1
            idx-=1
        while(second>=0):
            nums1[idx] = nums2[second]
            idx-=1
            second-=1
        

