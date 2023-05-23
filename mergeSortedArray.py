#TC: O(max(m, n))
#SC: O(1)

class Solution(object):

    def merge(self, nums1, m, nums2, n):
   
        if (nums2 == None or n <= 0):
            return

        ptr1 = m - 1;
        ptr2 = n - 1;
        idx = m + n - 1

        while (idx >= 0):
            if (ptr1 >= 0 and ptr2 >= 0 and nums1[ptr1] > nums2[ptr2]):   
                nums1[idx] = nums1[ptr1]
                ptr1 -= 1
            elif (ptr1 >= 0 and ptr2 >= 0 and nums1[ptr1] <= nums2[ptr2]):
                nums1[idx] = nums2[ptr2]
                ptr2 -= 1
            elif (ptr1 < 0):                     
                nums1[idx] = nums2[ptr2]
                ptr2 -= 1
            else:                                      
                nums1[idx] = nums1[ptr1]
                ptr1 -= 1
            idx -= 1

        return