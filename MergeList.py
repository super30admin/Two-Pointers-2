    """
    The approach here is to maintain 3 pointers. n1 at the arr1 till the len of m. and n2 till the len
    of n and k to the len of whole nums1 len. now starting from backwards at each step we check if the
    value at nums1 or nums2 at the last positions. depending on which is larger. we assign that to the
    last index of nums1 arr. same we do this for all the elements finally we have a sorted array with 
    all values inserted.
    Leetcode - running
    Time complexity - O(N)
    
    """
    
    def merge(self, nums1, m, nums2, n):
        n1 = m - 1
        n2 = n - 1
        k = m+n - 1
        
        while n2 >= 0:
            if k == -1:
                nums1[:n2+1] = nums2[:n2+1]
                return nums1
            if nums2[n2] >= nums1[n1]:
                nums1[k] = nums2[n2]
                k -= 1
                n2 -= 1
                
            else:
                nums1[k] = nums1[n1]
                k -= 1
                n1 -= 1
        return nums1