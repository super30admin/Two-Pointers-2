# Runs on Leetcode
# Run time complexity : O(nlogn)
# Memory complexity : O(m+n)

# Will submit one more solution after class

'''

1) Add second array into first array from index m
2) Sort them using in built sort function

'''

class Solution:
    def merge(self, nums1, m, nums2, n):
        nums1[m:] = nums
        nums1.sort()
