# Time Complexity : O(m + n), m is no of elements in nums1 and n is no of elements in nums2
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# using three pointers, starting from the end of elements in nums1 and nums2
# whatever element is greater, we are putting at the last of nums1
# and then decrementing the pointer which we just replaced
# now this will go on until both the lists are covered
# now there can be a case when p2 is 0, this means all elements from nums2 have been put in nums1
# however, if p1 = 0 this means that all elements in nums1 have been put at the end of nums1
# and we can directly put elments in nums2 in nums1
# example nums1 - 40 50 60 0 0 0 and nums2 - 10 20 30
# after 40 is put at p3, p1 will be 0 and p2 still be at 30
# so we will but element at p2 at p3 in nums1

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        if nums1 and nums2 is None:
            return []
        
        
        # using three pointers
        p1 = m - 1
        p2 = n - 1
        p3 = m + n - 1

        while(p1 >= 0 and p2 >= 0):
            # putting the greater value from p1 and p2 at p3
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 -= 1
            else:
                nums1[p3] = nums2[p2]
                p2 -= 1 
            
            p3 -= 1
           
            # p2 has become 0
            # means all elements have been added to nums1, so no need to do anything here

        # p1 becomes 0
        # so put all elements in nums2 in nums1
        while(p2 >= 0):
            # element at p2 is put at p3
            nums1[p3] = nums2[p2]
            p3 -= 1
            p2 -= 1
        
        return nums1





        