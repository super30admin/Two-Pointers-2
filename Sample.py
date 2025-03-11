#Problem1

#Time Complexity :O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english

'''
took two pointer at tail = 0 and head = 1 position and checked if the the elements at both the position is same
if yes made the flag as true and moved the  tail pointer ahead by 1, stored the value at tail onto the value at head
and move the head pointer by 1

Checked if more that 1 value is same then moved the head pointer ahead.

if both the values are different then made the flag as false and moved the  tail pointer ahead by 1, stored the value at tail onto the value at head
and move the head pointer by 1

'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        flag = False
        head = 1
        tail = 0
        if(nums == None or len(nums)==0):
            return 0
        while(head < len(nums)):
            if(nums[tail] == nums[head]): # checking if two values are same
                if(flag == False):
                    flag = True
                    tail+=1 
                    nums[tail] = nums[head] # replacing the value at tail with value at head
                    head+=1
                else:
                    while((head<len(nums)) and (nums[head] == nums[head-1])): # if more than 2 values are same then moving on
                        head+=1
           
            else:
                flag = False # if both the values are different then replacing the value at tail with value at head
                tail+=1 
                nums[tail] = nums[head]
                head+=1
        return tail+1 # returning the number of elements
                
            

#*********************************************************************************
#Problem2
#Time Complexity :O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english

'''
Took 3 pointers 1 pointing to the m-1 location, second pointing to n-1 location 
and third pointing to the m+n-1 location
Checking if the number at m-1 >n-1 then putting number at m-1 to m+n-1 location
else putting number at n-1 location to m+n-1 location.
if still there are some elmenets left in the small aray then we copy all the left elements to the big array

'''

#Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1 = m-1
        ptr2 = n-1
        ptr3 = m+n-1
        
        if(n==0):
            return
        
        while ptr1>=0 and ptr2>=0:
            if(nums1[ptr1]> nums2[ptr2]): # checking which alue is greater
                nums1[ptr3] = nums1[ptr1] # Inserting the value at the last location of the big array
                ptr1-=1
                
            if(nums2[ptr2]> nums1[ptr1]):
                nums1[ptr3] = nums2[ptr2]
                ptr2-=1
                ptr3-=1
                
        while ptr2>=0:
            nums1[ptr3] = nums2[ptr2] #  if numbers are left, then copying all the left numbers into the big array
            ptr2-=1
            ptr3-=1

#**************************************************************************************
#Problem 3:

#Problem2
#Time Complexity :O(rows* log(cols))
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english

'''
Take 2 pointers one at the 0 and other at the rows-1
since the array is sorted search if the number is > 1st element of the last row
if yes move to the above row and serach else move to the next column and search

'''

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if(len(matrix)==0 or matrix == []):
            return False
        rows = len(matrix)
        col = len(matrix[0])
        i = rows-1
        j = 0
        while i>=0 and j<col:
	        if matrix[i][j]==target: # checking if the element at 1st column and last row == target
		        return True
	        if matrix[i][j]<target: # if the targer is greater than the 1st col last row element then move to nect column
    
		        j+=1
	        else: 
		        i-=1 # else move to the row above
        return False


