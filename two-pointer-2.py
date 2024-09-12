#Problem 1: Remove duplicates from sorted array
#Time Complexity: O(n)
#Space Complexity: O(1)
#Did this code successfully run on leetcode: yes

'''
Brute force:
count for each number and if it exceed two,delete.
'''
'''
Main idea:Keep a pointer where everything behind (not inclusively) is in place.
Swap a valid item with it and increment by one. A valid item is such that it's counter is smaller then 2
and that it's bigger then prev (so we don't keep adding items that were swaped). Meaning we only
consider numbers that are bigger then prev. At the the first part of the array will be what we want and the
position of the pointer will be the length.

'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)<2:
            return len(nums)
        to_swap=0
        prev=float("-inf")
        count=0
        for i,num in enumerate(nums):
            if num==prev:
                count+=1
            else:
                count=0
            if count<2 and num>=prev:
                prev=num
                nums[i],nums[to_swap]=nums[to_swap],nums[i]
                to_swap+=1
        return to_swap

#Problem 2: Merge Sorted Array
#Time Complexity: O(n+m)
#Space Complexity: O(1)
#Did this code successfully run on leetcode: yes

'''
Brute force: put them together and sort again
'''
'''
Main idea:
it would be easy to create another array of size m+n, and put in the min
will moving a pointer in array 1 and 2 and incrementing if we put something in the result array.
How can we do it with no extra space? We can start from the end of nums1 and take the max
of two pointers pointing from the last element nums1 and last element nums2. We decrement if
it was used. We don't need to be afraid of overwriting because
'''

'''
where pointer is always on the right of p1(the only way for where to reach p1)
is to have n consecutive move without p1 moving, meaning we've put all of
of the nums2 array. Since anything behind p1 was put behind where pointer (processed)
we do not fear overwriting where pointer (won't lose any information)
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:

        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1,p2 = m - 1,n - 1
        where = len(nums1) - 1
        while p1 >= 0 and p2 >= 0:
            if nums1[p1]>= nums2[p2]:
                nums1[where] =  nums1[p1]
                p1 -= 1
                where-=1
            else:
                nums1[where] = nums2[p2]
                p2 -= 1
                where-=1

        #in case there are any left in nums2 that we didn't put in the front
        #we don't need this for p1 since if p2 is out of bounds before p1,
        #it means all the elements in the front are in the right place in nums1
        nums1[:p2+1]=nums2[:p2+1]


#Problem 3: Search a 2D matrix II
#Time Complexity: O(n+m)
#Space Complexity: O(1)
#Did this code successfully run on leetcode: yes

'''
Brute force:
Iterate through the whole array and find
'''
'''
Main idea: We notice that if a certain element is bigger than the target, every element on that row (to the right) is bigger
than that target. So the only move left that is not wasteful is to move up. Similarly, if the element is smaller than
the target, then there's no point going up since it will surely be smaller, so the only valid move is to move to the right.
Finally with this logic, we want to make sure that we do not skip any rows or columns with this movement
so we naturally start at the bottom left (because if we start somewhere else all the columns on the left
and rows to the bottom will never be reached, since we can only move right and up). If it goes out of bound,
means we can't find it
'''

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix:
            return False
        i,j= len(matrix)-1,0

        while 0<=i<len(matrix) and 0<=j<len(matrix[0]):
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]>target:
                i-=1
            else:
                j+=1
        return False
