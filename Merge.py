class Merge(object):
    '''
    Solution:
    1.  Instead of starting from first index in both the arrays as in traditional merge function in merge sort, we start
        from the end index in both the arrays.
    2. We get the same four cases as in traditional merge function in merge sort and we need to maintain another index
        tracker which starts from the end of extra space in first array.
    3. After putting the elements in place using the four cases, return

    --- Passed all testcases on Leetcode successfully
    O(max(m, n)) Time Complexity | O(1) Space Complexity
    '''
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        if (nums2 == None or n <= 0):
            return

        ptr1 = m - 1;
        ptr2 = n - 1;
        idx = m + n - 1

        while (idx >= 0):
            if (ptr1 >= 0 and ptr2 >= 0 and nums1[ptr1] > nums2[ptr2]):         # case 1 -- also check for out of bounds
                nums1[idx] = nums1[ptr1]
                ptr1 -= 1
            elif (ptr1 >= 0 and ptr2 >= 0 and nums1[ptr1] <= nums2[ptr2]):      # case 2 -- also check for out of bounds
                nums1[idx] = nums2[ptr2]
                ptr2 -= 1
            elif (ptr1 < 0):                                                    # case 3
                nums1[idx] = nums2[ptr2]
                ptr2 -= 1
            else:                                                               # case 4
                nums1[idx] = nums1[ptr1]
                ptr1 -= 1
            idx -= 1

        return