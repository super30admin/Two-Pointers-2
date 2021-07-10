class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        # we are not checking for m==0 because
        # nums1 = [0] and nums2 = [1]
        # here, m==0 and we still need to copy a value from num2 to nums1
        if not nums1 or not nums2 or n == 0:
            return
        
        ptr1 = m - 1
        ptr2 = n - 1
        curr = m + n - 1
        
        while ptr1 >= 0 and ptr2 >= 0:
            # check which is greater
            if (nums1[ptr1] > nums2[ptr2]):
                nums1[curr] = nums1[ptr1]
                ptr1 -= 1
            else:
                nums1[curr] = nums2[ptr2]
                ptr2 -= 1
            
            curr -= 1 # irrespective of either case, movine curr (just like for loop)
        
        # if there are still values left in N
        while (ptr2 >= 0):
            nums1[curr] = nums2[ptr2]
            curr -= 1
            ptr2 -= 1

# TC: O(M+N) SC:O(1)