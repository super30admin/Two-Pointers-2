# Time Complexity : O(m + n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
# We start with 3 pointers, 2 at the end of num1 array and 1 at the end of num2 array
# At each step we compare number at each pointer and move the bigger one at the end of num1

# Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        Do not return anything, modify nums1 in-place instead.
        """
        index = m+n - 1
        p1 = m-1
        p2 = n-1  
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[index] = nums1[p1]
                p1-=1
            else:
                nums1[index] = nums2[p2]
                p2-=1
            index-=1
        while p2 >= 0:
            nums1[index] = nums2[p2]
            p2-=1
            index-=1