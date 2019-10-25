#Time Complexity:O(n+m)
#space complextiy:O(1)
#Leetcode submission:successful
# we are doing a in place comparisons and changing the values of nums1 according as we compare the elements
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        
      
        while m > 0 and n > 0:
            if nums1[m - 1] > nums2[n - 1]:
                nums1[m + n - 1] = nums1[m - 1]
                m -= 1
            else:
                nums1[m + n - 1] = nums2[n - 1]
                n -= 1
                
        nums1[:n] = nums2[:n]